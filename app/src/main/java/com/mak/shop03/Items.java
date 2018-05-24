package com.mak.shop03;

/**
 * Created by Макс on 16.05.2018.
 */

public class Items {
    private String name;
    private String surname;
    private String address;


    public Items(String name, String  surname, String address){
        this.setName(name);
        this.setSurname(surname);
        this.setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
