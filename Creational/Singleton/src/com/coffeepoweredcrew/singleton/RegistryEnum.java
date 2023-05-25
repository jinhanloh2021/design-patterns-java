package com.coffeepoweredcrew.singleton;

/**
 * (Ref. Google I/O 2k8 Joshua Bloch)
 * Since Java 1.5 using enum we can create a singleton. It handles serialization
 * using java's in-built
 * mechanism and still ensure single instance
 */

// Enums are not extendable, cannot create an object of enum.
// Handles serialisation and de-serialisation issues
public enum RegistryEnum {
    INSTANCE;

    public void getConfiguration() {
    }
}