package observer;

/**
 * This will represent a book object.
 * @author Camron Martin
 */
public class Book {

    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;


    /**
     * This will return the title of the book
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * This will return the genre of the book
     * @return genre
     */
    public Genre getGentre() {
        return this.genre;
    }
    
    /**
     * This will return the book author's first name
     * @return authorFirstName
     */
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    /**
     * This will return the book author's last name
     * @return authorLastName
     */
    public String getAuthorLastName() {
        return this.authorLastName;
    }

    /**
     * This will return the description of the book
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("---- " + this.getTitle() + "----");
        return sb.toString();
    }
    
}
