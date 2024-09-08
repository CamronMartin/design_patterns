package decorato;

import decorato.Character;
import java.util.ArrayList;

public abstract class CharacterDecorator extends Character{

    private Character character;

    /**
     * 
     * @param character
     */
    public CharacterDecorator(Character character) {
        super(character.lines, character.getName());
        this.character = character;
        integrateDecor(character.lines);
    }

    protected void integrateDecor(ArrayList<String> decor) {
        
    }

    @Override
    public String toString() {
        return String.join("\n", this.lines);
    }
    
}
