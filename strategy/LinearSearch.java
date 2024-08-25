package strategy;

import java.util.List;

/**
 * A class that will perfrom a linear search.
 * @author Camron Martin
 */
public class LinearSearch implements SearchBehavior{

    /**
     * This is a method that will search through the list of guests in order to find a 
     * specific person.
     */
    public boolean contains(List<Person> people, Person person) {

        for(int i = 0; i < people.size(); ++i) {
             if(people.get(i).equals(person)){
                 return true;
             }// Ending bracket of if

        }// Ending bracket of for-loop
        return false;
    }// Ending bracket of method contains()

}// Ending bracket of method LinearSearch
