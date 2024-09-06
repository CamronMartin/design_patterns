package decorato;

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
        integrateDecor(lines);
    }

    protected abstract void integrateDecor(ArrayList<String> decor);

    @Override
    public String toString() {
        return character.toString();
    }
    
}
