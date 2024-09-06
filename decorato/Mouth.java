package decorato;

import java.util.ArrayList;

public class Mouth extends CharacterDecorator{

    public Mouth(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.set(10,"           .-\"`\"`-'\"`\"-. ");
        decor.set(11,"           `~\":-...-:\"~` ");
        decor.set(12,"               `---'");
    }

}
