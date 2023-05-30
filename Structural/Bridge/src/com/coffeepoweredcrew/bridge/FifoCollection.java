package com.coffeepoweredcrew.bridge;

// This is the abstraction.
// It represents a First in First Out collection
public interface FifoCollection<T> {
    // Adds to end of queue
    void offer(T element);

    // Removes from front of queue
    T poll();

}
