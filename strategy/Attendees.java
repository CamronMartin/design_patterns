package strategy;

import java.util.List;

public class Attendees {

    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    public Attendees(String title) {
        this.title = title;
    }// Ending bracket of constructor

    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        return new Person(firstName, lastName, phoneNumber, reminder);
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
