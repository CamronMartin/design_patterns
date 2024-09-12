package state;

import java.util.Random;

/**
 * This class will be responsible for handling medium-difficulty questions.
 * @author Camron Martin 
 */
public class Medium implements State {

    private ArithemeticGame game;
    
    /**
     * This constructor will instansiate the medium state.
     * @param game the ArithemeticGame
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * This method will return a random number between 1-25
     * @return rnd a random number between 1-25
     */
    @Override
    public int getNum() {
        Random rnd = new Random();
        return rnd.nextInt(25) + 1;
    }

    /**
     * This method will return a random operation between "+", "-", or "*".
     * @return operation a random operator.
     */
    @Override
    public Operation getOperation() {

        Random rnd = new Random();
        int op = rnd.nextInt(3) + 1;

        if(op == 1) {
          return Operation.PLUS;
        } else if (op == 2) {
          return Operation.PLUS;
        } else {
          return Operation.MULTIPLY;
        }
    }

    /**
     * This method will increase the difficulty from medium to hard.
     */
    @Override
    public void increaseDifficulty() {
        game.setState(game.getHardState());
        System.out.println("Level increased to hard. ");
    }

    /**
     * This method will decrease the difficulty from medium to easy.
     */
    @Override
    public void decreaseDifficulty() {
        game.setState(game.getEasyState());
        System.out.println("Difficulty decreased to easy. ");
    }
    
}
