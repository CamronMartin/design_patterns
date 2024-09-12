package state;

import java.util.Random;

/**
 * This class will represent the easy state, it will contain 
 * easier questions using only # 1-10.
 * @author Camron Martin
 */
public class Easy implements State {

    private ArithemeticGame game;

    /**
    * This constructor instansiate the easy state.
    * @param game the ArithemeticGame
    */
    public Easy(ArithemeticGame game) {
    this.game = game;
    }

 
    /**
     * This method will return a random number between 1-10
     * @return rnd A random Number.
     */
    @Override
    public int getNum() {
      Random rnd = new Random();
      return rnd.nextInt(10) + 1;
    }

    /**
     * This method will return a random operation between "+" or "-"
     * @return operation a random operation.
     */
    @Override
    public Operation getOperation() {
      Random rnd = new Random();
      int op = rnd.nextInt(2);
      if(op == 1) {
        return Operation.PLUS;
      } 
      return Operation.MINUS;
    }

    /**
     * This method will increase the current difficulty of the game 
     * to medium.
     */
    @Override
    public void increaseDifficulty() {
      game.setState(game.getMediumState());
      System.out.println("Difficulty increased to medium. ");
    }


    /**
     * This method will output a statement since this
     * is the lowest level.
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("Ummm you should study more."); 
    }

}
