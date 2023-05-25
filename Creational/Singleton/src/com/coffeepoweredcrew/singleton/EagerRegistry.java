package com.coffeepoweredcrew.singleton;

/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {
    // Private constructor, means cannot inherit from EagerRegistry
    private EagerRegistry() {
    }

    // This variable holds the SINGLE INSTANCE
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    // Singleton getter
    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}