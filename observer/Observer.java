package observer;

/**
 * This interface will be the observer that is responsible
 * for passing along the updates
 * @author Camron Martin
 */
public interface Observer {
    
    /**
     * This method will be responsible for providing updates.
     * @param book
     */
    public void update(Book book);
    
}
