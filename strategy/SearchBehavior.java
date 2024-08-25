package strategy;

import java.util.List;

/** 
 * An interface that will list only the contain method
 * @author Camron Martin
*/
public interface SearchBehavior {
    
    public boolean contains(List<Person> people, Person person);

}// Ending bracket of class SearchBehavior
