package main.java.com.library.application;

import main.java.com.library.model.Book;
import main.java.com.library.model.LibraryItem;
import main.java.com.library.model.User;
import main.java.com.library.service.Library;
import main.java.com.library.service.LibraryManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LibraryManager library = new Library();

        // Thêm sách
        library.addItem(new Book(1, "Book 1", "Author 1", 10));
        library.addItem(new Book(2, "Book 2", "Author 2", 5));

        // Xem danh sách sách
        System.out.println("Danh sách sách:");
        for (LibraryItem item : library.listItems()) {
            System.out.println(item);
        }

        // Thêm người thuê
        User user1 = new User(1, "User 1", 20, new ArrayList<>());
        library.addUser(user1);

        // Xem danh sách người thuê
        System.out.println("Danh sách người thuê:");
        for (User user : library.listUsers()) {
            System.out.println(user);
        }

        // Sửa thông tin sách
        library.updateItem(1, "Updated Book 1", "Updated Author 1", 15);

        // Xem lại danh sách sách sau khi sửa
        System.out.println("Danh sách sách sau khi sửa:");
        for (LibraryItem item : library.listItems()) {
            System.out.println(item);
        }

        // Sửa thông tin người thuê
        library.updateUser(1, "Updated User 1", 25);

        // Xem lại danh sách người thuê sau khi sửa
        System.out.println("Danh sách người thuê sau khi sửa:");
        for (User user : library.listUsers()) {
            System.out.println(user);
        }

        // Xóa sách
        library.deleteItem(2);

        // Xem lại danh sách sách sau khi xóa
        System.out.println("Danh sách sách sau khi xóa:");
        for (LibraryItem item : library.listItems()) {
            System.out.println(item);
        }
    }
}
