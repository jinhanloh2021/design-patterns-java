package com.cpc.dp.builder;

import java.time.Period;
import java.time.LocalDate;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {
    private String fname;
    private String lname;
    private String age;
    private String address;
    private UserWebDTO dto; // what we want to build

    @Override
    public UserDTO build() {
        this.dto = new UserWebDTO(this.fname + " " + this.lname, this.address, this.age);
        return this.dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return this.dto;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        StringBuilder sb = new StringBuilder(); // same idea as string builder
        this.address = sb.append(address.getHouseNumber()).append(", ").append(address.getStreet()).append("\n")
                .append(address.getCity()).append("\n").append(address.getState()).append(" ")
                .append(address.getZipcode()).toString();
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this; // always return this to do method chaining.
    }

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.fname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lname = lname;
        return this;
    }

}
