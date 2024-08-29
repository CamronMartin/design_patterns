package observer;

import java.util.ArrayList;

/**
 * This class will represent a collection of best sellers,
 * while implementing the observer class.
 * @author Camron Martin
 */
public class BestSellers implements Subject{
    
    private ArrayList<Book> bestSellers = new ArrayList<>();
    private ArrayList<Observer> observers = new ArrayList<>();
    

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

    /**
     * This method will register an observer
     * @param Observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }


    /**
     * This method will remove any observer
     * that has been registered
     * @param Observer 
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    /**
     * This method will notify each registered observer
     * when an event occurs
     * @param Book 
     */
    public void notifyObservers(Book book) {
        for(Observer obs : observers) {
            obs.update(book);
        }
    }
    
}
