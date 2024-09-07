package decorato;

import java.util.ArrayList;

public class Nose extends CharacterDecorator{

    public Nose(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add(7,"                 _");
        decor.add(8,"                / \\ ");
        decor.add(9,"               (   )");
        decor.add(10,"                `-' ");
    }
    
}
