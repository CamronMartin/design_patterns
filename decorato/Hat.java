package decorato;

import java.util.ArrayList;

public class Hat extends CharacterDecorator{

    public Hat(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.set(0,"              .-\"'\"-.");
        decor.set(1,"             |       |");
        decor.set(2,"           (`-._____.-')");
        decor.set(3,"            `-._____.-'");
    }

    @Override
    public String toString() {
        ArrayList<String> decor = new ArrayList<>();
        integrateDecor(decor);
        StringBuffer result = new StringBuffer(super.toString());
        for (String line : decor) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
    
    
}
