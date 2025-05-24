import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A generic Bag class that stores a collection of items,
 * allowing duplicates and basic operations such as add, remove, and count.
 *
 * @param <T> the type of elements stored in the bag
 */
public class Bag<T> {
    private List<T> items;

    /**
     * Constructs an empty Bag.
     */
    public Bag() {
        items = new ArrayList<>();
    }

    /**
     * Adds an item to the bag.
     *
     * @param item the item to be added
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Removes the first occurrence of the specified item from the bag, if present.
     *
     * @param item the item to be removed
     */
    public void remove(T item) {
        items.remove(item); // removes first occurrence
    }

    /**
     * Checks whether the bag contains the specified item.
     *
     * @param item the item to check for presence
     * @return {@code true} if the item is in the bag, {@code false} otherwise
     */
    public boolean contains(T item) {
        return items.contains(item);
    }

    /**
     * Counts the number of occurrences of the specified item in the bag.
     *
     * @param item the item to count
     * @return the number of times the item occurs in the bag
     */
    public int count(T item) {
        int count = 0;
        for (T i : items) {
            if (i.equals(item)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the total number of elements in the bag, including duplicates.
     *
     * @return the number of elements in the bag
     */
    public int size() {
        return items.size();
    }

    /**
     * Merges the contents of another bag into this bag.
     * All elements from the specified bag, including duplicates, are added to this bag.
     *
     * @param otherBag the bag whose elements are to be added to this bag
     */
    public void merge(Bag<T> otherBag) {
        this.items.addAll(otherBag.items);
    }

    /**
     * Returns a new bag containing only the distinct elements from this bag.
     * The order of first occurrence is preserved.
     *
     * @return a new Bag instance with distinct elements
     */
    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        Set<T> seen = new HashSet<>();
        for (T item : items) {
            if (seen.add(item)) {
                distinctBag.add(item);
            }
        }
        return distinctBag;
    }

    /**
     * Returns a string representation of the bag.
     *
     * @return a string listing all items in the bag
     */
    @Override
    public String toString() {
        return items.toString();
    }
}