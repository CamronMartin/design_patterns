package decorator;

import java.util.ArrayList;


public class CharacterDecorator extends Character{

    private Character character;

    /**
     * Constructor for CharacterDecorator.
     * @param character The Character object to be decorated.
     */
    public CharacterDecorator(Character character) {
        // Initialize the base Character class with the provided character's lines and name.
        super(character.lines, character.getName());
        this.character = character;
        // Integrate the decoration with the provided character's lines.
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


