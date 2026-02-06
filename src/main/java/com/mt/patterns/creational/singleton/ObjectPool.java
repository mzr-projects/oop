package com.mt.patterns.creational.singleton;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ObjectPool<T> {

    /*
     * Stop us from adding something to the full queue
     * */
    private final BlockingQueue<T> queue;
    private final int maxSize;

    public ObjectPool(int maxSize) {
        this.queue = new ArrayBlockingQueue<>(maxSize);
        this.maxSize = maxSize;
    }

    public void add(T item) {
        if (queue.size() <= maxSize) {
            queue.add(item);
        }
    }

    public T get() {
        return queue.poll();
    }

    public void clear() {
        queue.clear();
    }

    public void release(T item) throws InterruptedException {
        queue.put(item);
    }

    public int getNumberOfObjects() {
        return queue.size();
    }
}
