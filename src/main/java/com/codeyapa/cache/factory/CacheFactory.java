package com.codeyapa.cache.factory;

import com.codeyapa.cache.Cache;
import com.codeyapa.cache.policy.LRUEvictionPolicy;
import com.codeyapa.cache.storage.HashMapStorage;

public class CacheFactory<Key, Value> {
    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<>(new HashMapStorage<Key, Value>(capacity), new LRUEvictionPolicy<Key>());
    }
}
