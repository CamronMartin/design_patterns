package strategy;

import java.util.List;

public class LinearSearch implements SearchBehavior{

    public boolean contains(List<Person> people, Person person) {

        for(int i = 0; i < people.size(); ++i) {
             if(people.get(i).equals(person)){
                 return true;
             }// Ending bracket of if

        }// Ending bracket of for-loop
        return false;
    }// Ending bracket of method contains()

}// Ending bracket of method LinearSearch
