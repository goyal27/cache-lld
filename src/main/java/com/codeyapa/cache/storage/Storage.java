package com.codeyapa.cache.storage;

public interface Storage<Key,Value> {
    void put(Key key, Value value);
    void remove(Key key);
    Value get(Key key);
}
