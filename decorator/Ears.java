package decorator;

import java.util.ArrayList;


/**
 * This class will be responsible for adding ears
 * to the head
 * @author Camron Martin
 */
public class Ears extends CharacterDecorator {

    /**
     * This constructor will create ears for the potatoe head.
     * @param character
     */
    public Ears(Character character) {
        super(character);
        ArrayList<String> ears = FileReader.getLines("decorator/text/ears.txt");
        integrateDecor(ears);
    }

}
