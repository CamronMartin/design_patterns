package decorato;

import decorato.Character;

public class PotatoeHead extends Character {

    private Character character;

    public PotatoeHead(String name) {
        super(FileReader.getLines("text/potatoe-head.txt"), name);
    }

    
}
