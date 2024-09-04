import java.util.ArrayList;

/**
 * This class will be used to instantiate a character
 * @author Camron Martin
 */
public class Character {

    private String name;
    protected ArrayList<String> lines;

    public Character(ArrayList<String> lines, String name){
        this.name = name;
        lines = new ArrayList<String>();
    }


    /**
     * This method will return the name of 
     * the created character
     * @return name of character
     */
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        // TODO: Finish
        String rv = "";
        return rv;
    }
    
}
