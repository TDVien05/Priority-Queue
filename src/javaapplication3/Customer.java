/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author DELL
 */

public class Customer {
    private String name;
    private String address;
    private String phone;
    private Priority priority;

    public Customer() {
    }

    public Customer(String name, String address, String phone, Priority priority) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", address=" + address + ", phone=" + phone + ", priority=" + priority + '}';
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    
    
}
