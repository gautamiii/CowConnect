package com.example.gautam.cowconnect;

/**
 * Created by Gautam on 2/23/2018.
 */

public class Module_NameContact {

    private  String name,contact;

    public Module_NameContact(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getContact() {return contact;}

    public void setContact(String contact) {this.contact = contact;}
}
