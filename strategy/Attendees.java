package strategy;

import java.util.List;
import java.util.ArrayList;

public class Attendees {

    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    public Attendees(String title) {
        this.title = title;
        people = new ArrayList<Person>();
        this.searchBehavior = new LinearSearch();
    }// Ending bracket of constructor

    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person p = new Person(firstName, lastName, phoneNumber, reminder);

        if(searchBehavior.contains(people, p)) {
            return null;
        } else {
            people.add(p);
            return p;
        }// Ending bracket of if-else
        
    }// Ending bracket of method add()

    public String getTitle() {
        return this.title;
    }// Ending bracket of method getTitle()

    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }// Ending bracket of method setSearchBehavior

    public List<Person> getList() {
        return this.people;
    }// Ending bracket of method getList
}
