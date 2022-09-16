package arraylist;

import java.util.ArrayList;

public class ArrayObject {
    public static void main(String[] args){
        ArrayList<Book> arrayOfBooks = new ArrayList<>();
        arrayOfBooks.add(new Book("Harry Potter", "J.K. Rowling", 4));
        arrayOfBooks.add(new Book("The Lord Of the Rings", "J.R.R. Tolkien", 4.5));
        arrayOfBooks.add(new Book("1984", "George Orwell", 4));

        for(Book book: arrayOfBooks){
            System.out.println(book.toString());

        }
    }
}
