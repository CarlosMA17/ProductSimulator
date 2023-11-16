package com.sharedResource;

import java.util.concurrent.BlockingDeque;

public class Patch {
    private BlockingDeque<String> store;
    private final int STORE_CAPACITY;

    public Patch(BlockingDeque<String> store, int STORE_CAPACITY) {
        this.store = store;
        this.STORE_CAPACITY = 20;
    }
}
