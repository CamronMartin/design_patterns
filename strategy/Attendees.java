package strategy;

import java.util.List;
import java.util.ArrayList;

/**
 * A list of all the guests that will attend the birthday party.
 * @author Camron Martin
 */
public class Attendees {

    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;

    /**
     * This will instantiate a a list of guests as well as 
     * creating a title for the list.
     */
    public Attendees(String title) {
        this.title = title;
        people = new ArrayList<Person>();
        this.searchBehavior = new LinearSearch();
    }// Ending bracket of constructor

    /**
     * A method that will add a new person to the list if they are not already on it.
     * @param firstName A string that represents the first name of a person.
     * @param lastName A string that represents the last name of a person.
     * @param phoneNumber A string that represents the phone number of a person.
     * @param reminder A string that represents a reminder for a person.
     * @return the person being added.
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person p = new Person(firstName, lastName, phoneNumber, reminder);

        if(searchBehavior.contains(people, p)) {
            return null;
        } else {
            people.add(p);
            return p;
        }// Ending bracket of if-else

    }// Ending bracket of method add()

    /**
     * A method that will return the title of the list.
     * @return title string
     */
    public String getTitle() {
        return this.title;
    }// Ending bracket of method getTitle()


    /**
     * A method that will set the specified search.
     * @param searchBehavior choice of search.
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }// Ending bracket of method setSearchBehavior


    /**
     * A method that will return the list of guests
     * @return List<Person>
     */
    public List<Person> getList() {
        return this.people;
    }// Ending bracket of method getList

}// Ending bracket of class Attendees

