package observer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class will be a collection of fan recommendations on books.
 * @author Camron Martin
 */
public class FanReads implements Observer{
    
    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;
    private String firstName;
    private String lastName;

    /**
     * This constructor will instantiate a new FanReads customer
     * that can either subscribe, unsubscribe, or be notified when
     * updates occur
     * @param subject Whether they wish to subscribe, unsubscribe, or be notified
     * @param firstName of the new customer
     * @param lastName of the new customer
     */
    public FanReads(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.recommendations = new HashMap<>();
        subject.registerObserver(this);
    }


    /**
     * This will updated the recommendations list, and will add
     * a book to the ArrayList of books.
     * @param Book
     */
    public void update(Book book) {

        Genre genre = book.getGenre();

        ArrayList<Book> books = this.recommendations.get(genre);

        if(books == null) {
            books = new ArrayList<>();
            this.recommendations.put(genre, books);
        }

        books.add(book);
    }

    /**
     * This will get the recommendations of books for a certain genre
     * @param genre
     * @return ArrayList<Book> of recommendations.
     */
    public ArrayList<Book> getRecommendations(Genre genre) {
        return this.recommendations.get(genre);
    }
}
