package decorato;

import java.util.ArrayList;

public class Eyes extends CharacterDecorator {

    public Eyes(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.set(6,"              |0| |0|");
    }

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
