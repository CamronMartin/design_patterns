package decorato;

import decorato.Character;
import java.util.ArrayList;

public class Hat extends CharacterDecorator{

    public Hat(Character character) {
        super(character);
        ArrayList<String> hat = FileReader.getLines("text/hat.txt");
        integrateDecor(hat);
    }

}
