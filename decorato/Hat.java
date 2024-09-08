package decorato;

import decorato.Character;
import java.util.ArrayList;

/**
 * This class will be responsible for adding a hat onto the potatoe head character
 * @author Camron Martin
 */
public class Hat extends CharacterDecorator{

    /**
     * This constructor will instansiate the hat for the potatoe character
     * @param character
     */
    public Hat(Character character) {
        super(character);
        ArrayList<String> hat = FileReader.getLines("text/hat.txt");
        integrateDecor(hat);
    }

}
