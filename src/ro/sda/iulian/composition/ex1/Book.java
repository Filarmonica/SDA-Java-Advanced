package ro.sda.iulian.composition.ex1;

public class Book {
    private String titleofBook;
    private Author author;
    private double price;

    public Book(String titleofBook,Author author,double price){
        this.titleofBook=titleofBook;
        this.price=price;
        this.author=author;

    }

    public String getTitleofBook() {
        return titleofBook;
    }

    public void setTitleofBook(String titleofBook) {
        this.titleofBook = titleofBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleofBook='" + titleofBook + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}';
    }
}
