/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajax;

/**
 *
 * @author talesviegas
 */
public class Composer {

    private String id;
    private String firstName;
    private String lastName;
    private String category;
    
    public Composer(String id, String firstName, String lastName, String category){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCategory() {
        return category;
    }
}
