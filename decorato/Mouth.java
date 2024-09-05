package decorato;

import java.util.ArrayList;

public class Mouth extends CharacterDecorator{

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.add("           .-\"`\"`-'\"`\"-. \n");
        decor.add("           `~\":-...-:\"~` ");
        decor.add("               `---'\n");
    }
    
}
