package decorato;

import decorato.Character;
import java.util.ArrayList;

/**
 * This class will graphically show the eyes for the potatoe head
 * character
 * @author Camron Martin
 */
public class Eyes extends CharacterDecorator {

    /**
     * This constructor will instansiate a pair of eyes
     * onto the potatoe head
     * @param character
     */
    public Eyes(Character character) {
        super(character);
        ArrayList<String> eyes = FileReader.getLines("text/eyes.txt");
        integrateDecor(eyes);
    }

    
}
