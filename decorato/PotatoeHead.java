package decorato;

import java.util.ArrayList;

public class PotatoeHead extends Character {

    private Character character;

    public PotatoeHead(String name) {
        super(loadHead(), name);
    }
    
    private static ArrayList<String> loadHead() {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("              ._____.");
        lines.add("           ./'..== ==.`\\.");
        lines.add("          :             :");
        lines.add("         :               :");
        lines.add("        /                 \\");
        lines.add("      _.|                 |._");
        lines.add("    .'.-|                 |-.`.");
        lines.add("   //'  |                 |  `\\\\");
        lines.add("  ||    |                 |    ||");
        lines.add("  ||     \\.             ./     ||");
        lines.add("  ||       '-._     _.-'       ||");
        lines.add(" /  \\       _/ `~:~` \\_       /  \\");
        lines.add("||||\\)   .-'    / \\    `-.   (/||||");
        lines.add("\\|||    (`.___.')-(`.___.')    |||/");
        lines.add(" '\"' jgs `-----'   `-----'     '\"'");
        return lines;
    }
}
