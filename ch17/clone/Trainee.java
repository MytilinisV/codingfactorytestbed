package gr.aueb.cf.ch17.clone;

import java.io.Serializable;
import java.util.Objects;

public class Trainee implements Cloneable, Serializable {
    private static final long serialVersionUID = 123456;
    private String description;
    private String name;
    private City city;
    private transient int hashCode;

    public Trainee() {

    }

    public Trainee(String description) {
        this.description = description;
    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;

        return Objects.equals(getDescription(), trainee.getDescription()) && Objects.equals(getName(), trainee.getName()) && Objects.equals(getCity(), trainee.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getName(), getCity());
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

}


