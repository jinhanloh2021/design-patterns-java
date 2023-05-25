package com.coffeepoweredcrew.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.function.Supplier;
import java.util.concurrent.LinkedBlockingQueue;

public class ObjectPool<T extends Poolable> {
    private BlockingQueue<T> availablePool;

    /*
     * Supplier can be a lambda function, such as
     * () -> new Bitmap("Logo.bmp")
     */
    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++) {
            availablePool.offer(creator.get());
        }
    }

    public T get() {
        /*
         * If pool is empty, can wait indefinitely, or can create new objects and add to
         * pool.
         * If our resource is external and limited, such as DB connections, then we can
         * wait for resource to become available.
         */
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            System.err.println("take() was interrupted");
        }
        return null;
    }

    // Return that object to object pool
    public void release(T obj) {
        obj.reset(); // Reset obj state, then can reuse.
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println("release() was interrupted");
        }
    }
}
