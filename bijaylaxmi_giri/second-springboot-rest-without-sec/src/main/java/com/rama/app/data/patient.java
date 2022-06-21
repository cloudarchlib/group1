package com.rama.app.data;

import java.util.Objects;

public class patient {
  public String name;
  public String age;
  public String ID;
  public String disease;

  public patient() {
  }

  public patient(String name, String age, String ID, String disease) {

    this.name = name;
    this.age = age;
    this.ID = ID;
    this.disease = disease;
  }

  public String getName() {
    return this.name;
  }

  public String getID() {
    return this.ID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof patient))
      return false;
    patient newpatient = (patient) o;
    return Objects.equals(this.name, patient.name)
            && Objects.equals(this.ID, patient.ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.ID);
  }

  @Override
  public String toString() {
    return "patient{" + ", name='" + this.name + '\'' + ", ID='" + this.ID + '\'' + '}';
  }
}

