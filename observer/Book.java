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
     * this constructor will instantiate a new object Book
     * @param title of the book 
     * @param genre of the book
     * @param authorFirstName of the book
     * @param authorLastName of the book
     * @param description of the book
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }


    /**
     * This will return the title of the book
     * @return title of the book
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * This will return the genre of the book
     * @return genre of the book
     */
    public Genre getGenre() {
        return this.genre;
    }

 
    /**
     * This will return the book author's first name
     * @return authorFirstName of the book
     */
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

   

    /**
     * This will return the book author's last name
     * @return authorLastName of the book
     */
    public String getAuthorLastName() {
        return this.authorLastName;
    }


    /**
     * This will return the description of the book
     * @return description of the book
     */
    public String getDescription() {
        return this.description;
    }
    

    /**
     * This method will return a String representation of the book
     * @return a String representation of a book
     */
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\n---- " + this.getTitle() + "----\n");
        sb.append(this.getGenre() + " by: " + this.getAuthorFirstName() + " " + this.getAuthorLastName());
        sb.append(this.getDescription());
        return sb.toString();
    }
    
}
