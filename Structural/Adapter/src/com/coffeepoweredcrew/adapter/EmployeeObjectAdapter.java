package com.coffeepoweredcrew.adapter;

/**
 * An object adapter. Using composition to translate interface
 */
public class EmployeeObjectAdapter implements Customer {
    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getAddress() {
        return this.adaptee.getOfficeLocation();
    }

    @Override
    public String getDesignation() {
        return this.adaptee.getJobTitle();
    }

    @Override
    public String getName() {
        return this.adaptee.getFullName();
    }
}
