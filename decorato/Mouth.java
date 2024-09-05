package decorato;

import java.util.ArrayList;

public class Mouth extends CharacterDecorator{

    public Mouth(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add("           .-\"`\"`-'\"`\"-. \n");
        decor.add("           `~\":-...-:\"~` \n");
        decor.add("               `---'\n");
    }
    
}
