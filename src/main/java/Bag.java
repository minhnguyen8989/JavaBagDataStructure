import java.util.ArrayList;
import java.util.List;

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
     * Returns a string representation of the bag.
     *
     * @return a string listing all items in the bag
     */
    @Override
    public String toString() {
        return items.toString();
    }
}