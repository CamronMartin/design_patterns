package observer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class will be fan recommendations on books.
 * @author Camron Martin
 */
public class FanReads {
    
    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations = new HashMap<>();

    public void update(Book book) {

        // TODO: Implement this method
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
