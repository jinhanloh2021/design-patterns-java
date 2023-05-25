package com.coffeepoweredcrew.singleton;

public class Client {

    public static void main(String[] args) {
        EagerRegistry eRegistry1 = EagerRegistry.getInstance();
        EagerRegistry eRegistry2 = EagerRegistry.getInstance();

        LazyRegistryWithDCL lRegistry1 = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lRegistry2 = LazyRegistryWithDCL.getInstance();
    }
}
