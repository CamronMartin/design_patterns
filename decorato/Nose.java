package decorato;

import java.util.ArrayList;

public class Nose extends CharacterDecorator{

    public Nose(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add("                 _\n");
        decor.add("                / \\ \n");
        decor.add("               (   )\n");
        decor.add("                `-' \n");
    }
    
}
