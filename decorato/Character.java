package decorato;

import java.util.ArrayList;

/**
 * This class will be used to instantiate a character
 * @author Camron Martin
 */
public class Character {

    private String name;
    protected ArrayList<String> lines;

    /**
     * This will instansiate a new character with a name
     * and an array list of lines to graphically show the character
     * @param lines
     * @param name
     */
    public Character(ArrayList<String> lines, String name){
        this.name = name;
        this.lines = lines;
    }

    /**
     * This method will return the name of 
     * the created character
     * @return name of character
     */
    public String getName() {
        return this.name;
    }

    /**
     * This method will return a graphically image on the character
     * that is created
     * @return an image of the character
     */
    @Override
    public String toString() {

        
        StringBuffer sb = new StringBuffer();
        //sb.append("------------").append(this.getName()).append("------------\n");
        for(String piece : lines) {
            sb.append(piece).append("\n");
        }
        return sb.toString();

    }
}
