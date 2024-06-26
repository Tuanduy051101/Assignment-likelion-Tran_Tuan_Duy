package main.java.com.library.model;

import java.util.Date;

public class Rental {
    private LibraryItem item;
    private Date rentalDate;
    private Date returnDate;
    private int quantity;

    public Rental(LibraryItem item, Date rentalDate, Date returnDate, int quantity) {
        this.item = item;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.quantity = quantity;
    }

    public LibraryItem getItem() {
        return item;
    }

    public void setItem(LibraryItem item) {
        this.item = item;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "item=" + item +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                ", quantity=" + quantity +
                '}';
    }
}