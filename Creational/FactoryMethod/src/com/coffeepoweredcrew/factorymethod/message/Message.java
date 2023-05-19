package com.coffeepoweredcrew.factorymethod.message;

/**
 * This class represents interface for our "product" which is a message
 * Implementations will be specific to content type.
 *
 */
public abstract class Message {

    public abstract String getContent();

    // Adds some default headers
    public void addDefaultHeaders() {
    }

    // # Has some code to encrypt the content
    public void encrypt() {
    }

}
