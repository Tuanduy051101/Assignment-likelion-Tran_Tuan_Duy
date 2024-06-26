package main.java.com.library.service;

import main.java.com.library.model.LibraryItem;
import main.java.com.library.model.User;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryManager {
    private List<LibraryItem> items;
    private List<User> users;

    public Library() {
        this.items = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    @Override
    public void updateItem(int id, String title, String author, int quantity) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                item.setQuantity(quantity);
                break;
            }
        }
    }

    @Override
    public void deleteItem(int id) {
        items.removeIf(item -> item.getId() == id);
    }

    public List<LibraryItem> listItems() {
        return items;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void updateUser(int id, String name, int age) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(name);
                user.setAge(age);
                break;
            }
        }
    }

    @Override
    public List<User> listUsers() {
        return users;
    }
}