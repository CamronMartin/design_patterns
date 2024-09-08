package decorato;

import decorato.Character;
import java.util.ArrayList;

/**
 * This will be responsible for creating a graphically image
 * of potatoe heads nose
 * @author Camron Martin
 */
public class Nose extends CharacterDecorator{

    /**
     * This constructor will instansiate a nose on top
     * of the potatoe head
     * @param character
     */
    public Nose(Character character) {
        super(character);
        ArrayList<String> nose = FileReader.getLines("text/nose");
    }
    
}
