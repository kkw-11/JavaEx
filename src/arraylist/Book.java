package arraylist;

public class Book {
    String bookName;
    String author;
    double rating;

    Book(String bookName, String author, double rating){
        this.bookName = bookName;
        this.author = author;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + "\'" +
                ", author='" + author + "\'" +
                ", rating" + rating + "\'" +
                "}";
    }
}
