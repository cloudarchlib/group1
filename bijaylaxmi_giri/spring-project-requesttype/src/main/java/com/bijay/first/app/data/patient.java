package com.bijay.first.app.data;

import java.util.Objects;

public class patient {
    public String name;
    public int age;
    public int ID;
    public String disease;

    public patient() {
    }

    public patient(String name, int age, int ID, String disease) {

        this.name = name;
        this.age = age;
        this.ID = ID;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    }


