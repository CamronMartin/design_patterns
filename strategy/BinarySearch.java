package strategy;

import java.util.Collections;
import java.util.List;

public class BinarySearch implements SearchBehavior{

    int lowerBound;
    int middleBound;
    int upperBound;

    public boolean contains(List<Person> people, Person person) {

        Collections.sort(people);
        lowerBound = 0;
        upperBound = people.size() - 1;

        while(lowerBound <= upperBound) {

            middleBound = (lowerBound + upperBound) / 2;
            if(person.compareTo(people.get(middleBound)) == 0) {
                return true;
            } else if(person.compareTo(people.get(middleBound)) > 0) {
                lowerBound = middleBound + 1;
            } else {
                upperBound = middleBound - 1;
            }
        }// Ending bracket of While loop
        return false;

    }// Ending bracket of method contains()
    
}// Ending bracket of class BinarySearch
