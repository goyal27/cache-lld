package com.codeyapa.cache.storage;

import com.codeyapa.cache.exception.KeyNotFoundException;
import com.codeyapa.cache.exception.StorageFullException;

public interface Storage<Key,Value> {
    void add(Key key, Value value) throws StorageFullException;
    void remove(Key key) ;
    Value get(Key key) throws KeyNotFoundException;
}
