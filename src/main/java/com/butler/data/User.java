/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.butler.data;

/**
 *
 * @author arsh
 */
public class User {
    private String name="empty name";
    private String number;
    private String address;
    private Float credit;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if(name==null){
            name="empty name";
        }
        this.name = name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean equals(User other){
        return this.number.trim().equals(other.getNumber().trim());
    }

    /**
     * @return the credit
     */
    public Float getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(Float credit) {
        this.credit = credit;
    }
}
