public class HashMap<K,V> extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable, Serializable {
    ···

    public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }
    ···

    public V get(Object key) {
        Node<K,V> e;
        return (e = getNode(hash(key), key)) == null ? null : e.value;
    }
    ···
}
