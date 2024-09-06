package decorato;

import java.util.ArrayList;

public class Mouth extends CharacterDecorator{

    public Mouth(Character character) {
        super(character);
    }

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        decor.set(10,"           .-\"`\"`-'\"`\"-. ");
        decor.set(11,"           `~\":-...-:\"~` ");
        decor.set(12,"               `---'");
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
