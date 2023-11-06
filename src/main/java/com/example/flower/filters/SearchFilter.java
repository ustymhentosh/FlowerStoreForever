package com.example.flower.filters;

import com.example.flower.store.Item;

public interface SearchFilter {
    boolean match(Item item);
}
