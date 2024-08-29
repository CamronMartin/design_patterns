package observer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

/**
 * This class will be an object representation of a Book-Store
 * @author Camron Martin
 */
public class Store implements Observer {

    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * This constructor will instantiate a store
     * with a new list of best-sellers
     * @param subject
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<Book>();
        subject.registerObserver(this);
    }

    /**
     * This method will update the best sellers
     * list 
     * @param Book
     */
    public void update(Book book) {
        if(bestSellers.size() >= 5) {
            bestSellers.poll();
        }
        bestSellers.add(book);
    }

    /**
     * this book will return this best sellers
     * @return linked list of best sellers
     */
    public List<Book> getBestSellers() {
        return new LinkedList<>(bestSellers);
    }
    
}
