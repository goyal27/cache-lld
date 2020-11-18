package com.codeyapa.cache.policy;

public interface EvictionPolicy<Key> {
    void keyAccessed(Key key);
    void evictKey();
}
