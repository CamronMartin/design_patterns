package decorato;

import java.util.ArrayList;

public class PotatoeHead extends Character {

    private Character character;

    public PotatoeHead(String name) {
        super(loadHead(), name);
    }
    
    private static ArrayList<String> loadHead() {
        ArrayList<String> lines = new ArrayList<>();
        lines.add(0,"              ._____.");
        lines.add(1,"           ./'..== ==.`\\.");
        lines.add(2,"          :             :");
        lines.add(3,"         :               :");
        lines.add(4,"        /                 \\");
        lines.add(5,"      _.|                 |._");
        lines.add(6,"    .'.-|                 |-.`.");
        lines.add(7,"   //'  |                 |  `\\\\");
        lines.add(8,"  ||    |                 |    ||");
        lines.add(9,"  ||     \\.             ./     ||");
        lines.add(10,"  ||       '-._     _.-'       ||");
        lines.add(11," /  \\       _/ `~:~` \\_       /  \\");
        lines.add(12,"||||\\)   .-'    / \\    `-.   (/||||");
        lines.add(13,"\\|||    (`.___.')-(`.___.')    |||/");
        lines.add(14, " '\"' jgs `-----'   `-----'     '\"'");
        return lines;
    }
}
