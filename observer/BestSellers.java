package observer;

import java.util.ArrayList;

public class BestSellers {
    
    private ArrayList<Book> bestSellers = new ArrayList<>();

    

    /**
     * This will add a book to the best sellers collection.
     * @param title of the book
     * @param genre of the book 
     * @param authorFirstname of the book
     * @param authorLastName of the book
     * @param description of the book
     */
    public void addBook(String title, Genre genre, String authorFirstname, String authorLastName, String description) {
        Book b = new Book(title, genre, authorFirstname, authorLastName, description);
        bestSellers.add(b);
    }
    
}
