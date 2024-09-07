package decorato;

import decorato.Character;
import java.util.ArrayList;

public class Eyes extends CharacterDecorator {

    public Eyes(Character character) {
        super(character);
<<<<<<< HEAD
=======
        integrateDecor(character.lines);
>>>>>>> 195eba7fb6d7495bd5d920ea217139383a4dc8ae
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
<<<<<<< HEAD
        decor.add(6,"              |0| |0|");
=======
        decor.set(6,"              |0| |0|");
        
>>>>>>> 195eba7fb6d7495bd5d920ea217139383a4dc8ae
    }
    
}
