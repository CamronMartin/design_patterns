package decorator;

import java.util.ArrayList;

/**
 * This class will be responsible for merging all the lines seamlessly
 * so the order does not matter.
 * @author Camron Martin
 * 
 */
public class CharacterDecorator extends Character{

    private Character character;

    /**
     * Constructor for CharacterDecorator.
     * @param character The Character object to be decorated.
     */
    public CharacterDecorator(Character character) {
        super(character.lines, character.getName());
        this.character = character;
        integrateDecor(character.lines);
    }

    /**
     * Integrates decoration into the existing lines of the character.
     * @param decor The decoration lines to be integrated.
     */
    protected void integrateDecor(ArrayList<String> decor) {

        for (int i = 0; i < lines.size(); i++) {
            String blank = "";
            String decorLine = decor.get(i);
            String linesLine = lines.get(i); 
           int maxLength = Math.max(decorLine.length(), linesLine.length());

            for (int n = 0; n < maxLength; n++) {
                if (n >= linesLine.length()) {
                    blank += decorLine.charAt(n);
                } else if (n >= decorLine.length()) {
                    blank += linesLine.charAt(n);
                } else if (decorLine.charAt(n) != ' ') {
                    blank += decorLine.charAt(n);
                } else if (linesLine.length() > n) {
                    blank += linesLine.charAt(n);
                }
            }
            
            lines.set(i, blank);
        }
    }
}


