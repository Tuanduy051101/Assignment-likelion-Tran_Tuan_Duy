package main.java.com.library.model;

public interface LibraryItem {
    int getId();
    String getTitle();
    String getAuthor();
    int getQuantity();
    void setQuantity(int quantity);
}


