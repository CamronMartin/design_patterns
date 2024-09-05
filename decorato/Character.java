package decorato;

import java.util.ArrayList;

/**
 * This class will be used to instantiate a character
 * @author Camron Martin
 */
public abstract class Character {

    private String name;
    protected ArrayList<String> lines;

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

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        for(String piece : lines) {
            sb.append(piece).append("\n");
        }
        return sb.toString();

    }
}
