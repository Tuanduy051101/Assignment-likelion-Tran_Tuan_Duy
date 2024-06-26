package main.java.com.library.service;

import main.java.com.library.model.LibraryItem;
import main.java.com.library.model.User;

import java.util.List;

public interface LibraryManager {
    void addItem(LibraryItem item);
    void updateItem(int id, String title, String author, int quantity);
    void deleteItem(int id);
    List<LibraryItem> listItems();
    void addUser(User user);
    void updateUser(int id, String name, int age);
    List<User> listUsers();
}

