package decorato;

import java.util.ArrayList;

public class Ears extends CharacterDecorator {

    public Ears(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add(3,"        ..               ..");
        decor.add(4,"      .', :.           .: ,`.");
        decor.add(5,"     : (  :             :  ) ;");
        decor.add(6,"     '._.:               :._.'");

    }

    
}
