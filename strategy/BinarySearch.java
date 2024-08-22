package strategy;

import java.util.Collections;
import java.util.List;

public class BinarySearch implements SearchBehavior{

    int lowerBound;
    int middleBound;
    int upperBound;

    public boolean contains(List<Person> people, Person person) {

        Collections.sort(people);
        int key = people.size()/2;
        return false;
        
    }// Ending bracket of method contains()
    
}// Ending bracket of class BinarySearch
