package decorato;

import java.util.ArrayList;

public class Ears extends CharacterDecorator {

    public Ears(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.set(3,"        ..               ..");
        decor.set(4,"      .', :.           .: ,`.");
        decor.set(5,"     : (  :             :  ) ;");
        decor.set(6,"     '._.:               :._.'");

    }

    
}
