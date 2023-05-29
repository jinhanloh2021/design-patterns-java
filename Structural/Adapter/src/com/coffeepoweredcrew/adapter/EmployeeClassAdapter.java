package com.coffeepoweredcrew.adapter;

/**
 * A class adapter, works as Two-way adapter
 * Employee is the adaptee, and we want to adapt to Customer
 * Employee -> Customer
 */
public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation(); // Inherited from Employee
    }

}
