package decorato;

import java.util.ArrayList;

public class Mouth extends CharacterDecorator{

    public Mouth(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add(10,"           .-\"`\"`-'\"`\"-. ");
        decor.add(11,"           `~\":-...-:\"~` ");
        decor.add(12,"               `---'");
    }

}
