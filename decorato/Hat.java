package decorato;

import java.util.ArrayList;

public class Hat extends CharacterDecorator{

    public Hat(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.set(0,"              .-\"'\"-.");
        decor.set(1,"             |       |");
        decor.set(2,"           (`-._____.-')");
        decor.set(3,"            `-._____.-'");
    }

}
