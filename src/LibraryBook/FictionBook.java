package LibraryBook;

import LibraryBook.Book;

public class FictionBook extends Book {
    private String category;

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(double bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
