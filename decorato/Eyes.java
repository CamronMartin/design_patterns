package decorato;

import java.util.ArrayList;

public class Eyes extends CharacterDecorator {

    public Eyes(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add("              |0| |0|");
    }
    
}
