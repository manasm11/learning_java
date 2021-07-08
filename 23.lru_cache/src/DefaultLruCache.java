import java.util.LinkedHashMap;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer>
        implements LruCache {

    /**
     * @param key
     * @return the value of the key if the key exists,
     * otherwise return -1
     */
    @Override
    public int get(int key) {
        return super.get(key);
    }

    /**
     * Update the value of the key if the key exists.
     * Otherwise, add the key-value pair to the cache.
     * If the number of keys exceeds the capacity from this operation,
     * evict the least recently used key.
     *
     * @param key
     * @param value
     */
    @Override
    public void put(int key, int value) {
        super.put(key, value);
    }

    /**
     * Set the max capacity of the cache
     *
     * @param capacity
     */
    @Override
    public void setCapacity(int capacity) {

    }

}
