package decorato;

import decorato.Character;
import java.util.ArrayList;

public class Eyes extends CharacterDecorator {

    public Eyes(Character character) {
        super(character);
        //integrateDecor(character.lines);
        //character.lines.set(5,"              |0| |0|");
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.set(5,"              |0| |0|");
    }
    
}
