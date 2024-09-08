package decorato;

import decorato.Character;
import java.util.ArrayList;

public class PotatoeHead extends Character {

    private Character character;

    public PotatoeHead(String name) {
        super(FileReader.getLines("potatoe-head.txt"), name);
    }

    private static ArrayList<String> loadHead() {

        ArrayList<String> potatoHead = FileReader.getLines("potatoe-head.txt");
        for(int i = 0; i < potatoHead.size(); ++i) {
            potatoHead.add(i, potatoHead.get(i));
        }
        return potatoHead;
    }
}
