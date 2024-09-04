package decorator;

import java.util.ArrayList;

public class CharacterDecorator extends Character{

    private Character character;

    /**
     * 
     * @param character
     */
    public CharacterDecorator(Character character) {
        this.character = character;
    }

    protected void integrateDecor(ArrayList<String> decor) {
        for(String d : decor) {
            lines.add(d);
        }
    }
    
}
