package com.wangdao.day12;

/**
 * @version 1.0
 * @auther cxw
 */
public class Homework03 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("呐喊", "鲁迅");
        library.addBook("活着", "余华");
        library.addBook("百年孤独", "马尔克斯");
        library.displayBooks();
    }
}

class Library {

    private static final Book[] BOOK = new Book[10];

    public boolean addBook(String title, String author) {
        Book book = new Book(title, author);
        for (int i = 0; i < BOOK.length; i++) {
            if (BOOK[i] == null) {
                BOOK[i] = book;
                return true;
            }
        }
        return false;
    }

    public void displayBooks() {
        for (Book book : BOOK) {
            if (book != null) {
                book.displayInfo();
            }
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public void displayInfo() {
            System.out.println("书名：" + title + "  作者：" + author);
        }
    }
}
