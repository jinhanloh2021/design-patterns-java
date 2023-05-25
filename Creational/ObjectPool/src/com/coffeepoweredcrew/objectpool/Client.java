package com.coffeepoweredcrew.objectpool;

import javafx.geometry.Point2D;

public class Client {
    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

    public static void main(String[] args) {

        // Get objects from pool
        Bitmap b1 = bitmapPool.get();
        Bitmap b2 = bitmapPool.get();

        // Use objects
        b1.setLocation(new Point2D(10, 10));
        b2.setLocation(new Point2D(-10, 0));
        b1.draw();
        b2.draw();

        // Release objects back to pool
        bitmapPool.release(b1);
        bitmapPool.release(b2);
    }
}
