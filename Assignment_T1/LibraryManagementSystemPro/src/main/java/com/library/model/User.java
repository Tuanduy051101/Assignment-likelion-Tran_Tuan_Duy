package main.java.com.library.model;

import java.util.List;

public class User extends Person {
    private List<Rental> rentals;

    public User(int id, String name, int age, List<Rental> rentals) {
        super(id, name, age);
        this.rentals = rentals;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", rentals=" + rentals +
                '}';
    }
}

