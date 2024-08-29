package observer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class will be an object representation of a Book-Store
 * @author Camron Martin
 */
public class Store {

    private Subject subject;
    private String title;
    private final Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<>();
    }

    public void update(Book book) {
        // TODO: Implement this method
    }

    public LinkedList<Book> getBestSellers() {
        return (LinkedList<Book>) this.bestSellers;
    }
    
}
