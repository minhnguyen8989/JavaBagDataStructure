import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * A generic Bag class that stores a collection of items,
 * allowing duplicates and basic operations such as add, remove, and count.
 *
 * @param <T> the type of elements stored in the bag
 */
public class Bag<T> {
    private Map<T, Integer> items;

    /**
     * Constructs an empty Bag.
     */
    public Bag() {
        items = new HashMap<>();
    }

    /**
     * Adds an item to the bag.
     *
     * @param item the item to be added
     */
    public void add(T item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
    }

    /**
     * Removes one occurrence of the specified item from the bag, if present.
     *
     * @param item the item to be removed
     * @return true if an item was removed, false if the item was not found
     */
    public boolean remove(T item) {
        Integer count = items.get(item);
        if (count == null) {
            return false;
        } else if (count == 1) {
            items.remove(item);
        } else {
            items.put(item, count - 1);
        }
        return true;
    }

    /**
     * Checks whether the bag contains the specified item.
     *
     * @param item the item to check for presence
     * @return {@code true} if the item is in the bag, {@code false} otherwise
     */
    public boolean contains(T item) {
        return items.containsKey(item);
    }

    /**
     * Counts the number of occurrences of the specified item in the bag.
     *
     * @param item the item to count
     * @return the number of times the item occurs in the bag
     */
    public int count(T item) {
        return items.getOrDefault(item, 0);
    }

    /**
     * Returns the total number of elements in the bag, including duplicates.
     *
     * @return the number of elements in the bag
     */
    public int size() {
        int total = 0;
        for (int count : items.values()) {
            total += count;
        }
        return total;
    }

    /**
     * Merges the contents of another bag into this bag.
     * All elements from the specified bag, including duplicates, are added to this bag.
     *
     * @param otherBag the bag whose elements are to be added to this bag
     */
    public void merge(Bag<T> otherBag) {
        for (Map.Entry<T, Integer> entry : otherBag.items.entrySet()) {
            T key = entry.getKey();
            int count = entry.getValue();
            items.put(key, items.getOrDefault(key, 0) + count);
        }
    }

    /**
     * Returns a new bag containing only the distinct elements from this bag.
     *
     * @return a new Bag instance with distinct elements
     */
    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        for (T key : items.keySet()) {
            distinctBag.add(key);
        }
        return distinctBag;
    }

    /**
     * Returns a string representation of the bag.
     *
     * @return a string listing all items and their counts in the bag
     */
    @Override
    public String toString() {
        return items.toString();
    }
}
