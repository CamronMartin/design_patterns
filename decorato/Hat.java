package decorato;

import java.util.ArrayList;

public class Hat extends CharacterDecorator{

    public Hat(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add(0,"              .-\"'\"-.");
        decor.add(1,"             |       |");
        decor.add(2,"           (`-._____.-')");
        decor.add(3,"            `-._____.-'");
    }

}
