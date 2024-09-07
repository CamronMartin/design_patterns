package decorato;

import java.util.ArrayList;

public class Eyes extends CharacterDecorator {

    public Eyes(Character character) {
        super(character);
        //integrateDecor(character.lines);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.set(6,"              |0| |0|");
    }
    
}
