package decorato;

import decorato.Character;
import java.util.ArrayList;

/**
 * This class will graphically show the mouth for the potatoe character
 * @author Camron Martin
 */
public class Mouth extends CharacterDecorator{

    /**
     * This constructor will instansiate a mouth piece
     * for the character
     * @param character
     */
    public Mouth(Character character) {
        super(character);
        ArrayList<String> mouth = FileReader.getLines("text/mouth.txt");
        integrateDecor(mouth);
    }


}
