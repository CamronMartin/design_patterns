package decorato;

import java.util.ArrayList;

public class Nose extends CharacterDecorator{

    public Nose(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.set(7,"                 _");
        decor.set(8,"                / \\ ");
        decor.set(9,"               (   )");
        decor.set(10,"                `-' ");
    }
    
}