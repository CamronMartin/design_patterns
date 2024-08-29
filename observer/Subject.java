package observer;

/**
 * This interface will implement three methods to control
 * the observer
 * @author Camron Martin
 */
public interface Subject {
    
    /**
     * Add an observer to the list
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * Removes an observer from the registered list
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * Will update any observer thats registered
     * @param book
     */
    public void notifyObservers(Book book);

}
