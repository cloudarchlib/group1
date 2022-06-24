package com.mahesh.app.data;

public class Patient {
    public String patient;
    public int age;
    public int id;
    public String disease;

    public Patient () {
    }

    public Patient(String patient, int age, int id, String disease){
        this.patient = patient;
        this.age = age;
        this.id = id;
        this.disease = disease;
    }

    public String getPatient() {
        return patient;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getDisease() {
        return disease;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
