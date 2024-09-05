package decorato;

import java.util.ArrayList;

public class Ears extends CharacterDecorator {

    public Ears(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add("        ..               ..\n");
        decor.add("      .', :.           .: ,`.\n");
        decor.add("     : (  :             :  ) ;\n");
        decor.add("     '._.:               :._.'\n");

    }
    
}
