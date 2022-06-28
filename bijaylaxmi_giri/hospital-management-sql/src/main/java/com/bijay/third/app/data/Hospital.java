package com.bijay.third.app.data;

public class Hospital {
    public String name;
    public int ID;
    public String address;

    public Hospital() {
    }

    public Hospital(String name, int ID, String address) {

        this.name = name;
        this.ID = ID;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }
}
