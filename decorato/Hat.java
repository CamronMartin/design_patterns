package decorato;

import java.util.ArrayList;

public class Hat extends CharacterDecorator{

    public Hat(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add("              .-\"'\"-.");
        decor.add("             |       |");
        decor.add("           (`-._____.-')");
        decor.add("            `-._____.-'");
    }
    
    
}
