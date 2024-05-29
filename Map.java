private static class Map<K,V>
        implements Map<K,V>, Serializable {
         
        private final Map < k ,v > m;    
        final Object      mutex;         
    
        SynchronizedMap(Map<K,V> m) {
            if (m==null)
                throw new NullPointerException();
            this.m = m;
            mutex = this;
        }
          
        public V get(Object key) {
            synchronized(mutex) {return m.get(key);}
        }
 
        public V put(K key, V value) {
            synchronized(mutex) {return m.put(key, value);}
        }
        public V remove(Object key) {
            synchronized(mutex) {return m.remove(key);}
        }
}