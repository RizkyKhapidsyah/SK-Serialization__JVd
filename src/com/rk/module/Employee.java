
package com.rk.module;


public class Employee implements java.io.Serializable {

    public String name;
    public String email;
    public String city;
    public int number;

    @Override
    public String toString() {

        return "Name: " + name + "\r\nEmail: " + email + "\r\nCity: " + city +
                "\r\nNumber: " + number;

    }
}
