package state;

import java.util.Random;

/**
 * This class will represent the Hard state for the ArithemeticGame 
 * it will be responsible for giving the hardest questions.
 * @author Camron Martin
 */ 
public class Hard implements State {

    private ArithemeticGame game;

    /**
     * This constructor will instansiate the hard state.
     * @param game the ArithemeticGame
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * This method will return a random number between 1-50
     * @return rnd a random number between 1-50
     */
    @Override
    public int getNum() {
        Random rnd = new Random();
        return rnd.nextInt(50) + 1;
    }

    /**
     * This method will return a random operation between +, -, *, or /. 
     * @return operation a random operation
    */
    @Override
    public Operation getOperation() {
        Random rnd = new Random();
        int op = rnd.nextInt(4) + 1;
        
        if(op == 1) {
            return Operation.PLUS;
        } else if (op == 2) {
            return Operation.MINUS;
        } else if (op == 3) {
            return Operation.MULTIPLY;
        } else {
            return Operation.DIVIDE;
        }
    }

    /**
     * This method will will only output because this is the hardest difficulty. 
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("You are one smart cookie! ");
    }

    /**
     * This method will set the games state back to medium difficulty.
     */
    @Override
    public void decreaseDifficulty() {
        this.game.setState(game.getMediumState());
        System.out.println("Difficulty decreased to medium. ");

    }
    
}
