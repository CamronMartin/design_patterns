package decorato;

import java.util.ArrayList;

public abstract class CharacterDecorator extends Character{

    private Character character;

    /**
     * 
     * @param character
     */
    public CharacterDecorator(Character character) {
        super(new ArrayList<>(), character.getName());
        this.character = character;
    }

    protected abstract void integrateDecor(ArrayList<String> decor);
    
}
