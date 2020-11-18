package com.codeyapa.cache;

import com.codeyapa.cache.policy.EvictionPolicy;
import com.codeyapa.cache.storage.Storage;

public class Cache<Key, Value> {
    private final Storage<Key, Value> storage;
    private final EvictionPolicy<Key> evictionPolicy;

    public Cache(Storage storage, EvictionPolicy evictionPolicy) {
        this.storage = storage;
        this.evictionPolicy = evictionPolicy;
    }

    public Value get(final Key key) {
        return null;
    }

    public void put(final Key key, final Value value) {
    }
}
