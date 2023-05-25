package com.coffeepoweredcrew.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that,
 * we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {
    private LazyRegistryIODH() {
    }

    /*
     * Private static inner class. Don't need synchronisation.
     * Java's Class-Loader already handles synchronization to avoid loading same
     * class multiple times. That means inner class will be loaded only once no
     * matter how many threads are trying to call it at same time.
     */
    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
