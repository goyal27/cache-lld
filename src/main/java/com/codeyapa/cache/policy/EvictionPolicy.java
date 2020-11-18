package com.codeyapa.cache.policy;

public interface EvictionPolicy<Key> {
    void keyAccessed(Key key);
    Key evict();
}
