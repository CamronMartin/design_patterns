package decorato;

import decorato.Character;

/**
 * This will be a graphical representation
 * of a potatoe head
 * @author Camron Martin
 */
public class PotatoeHead extends Character {

    private Character character;

    /**
     * This will instansiate the potatoe head so we can add
     * decorations on top of it
     * @param name
     */
    public PotatoeHead(String name) {
        super(FileReader.getLines("potatoe-head.txt"), name);
    }

    
}
