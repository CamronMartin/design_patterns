package state;

import java.util.Random;

public class Medium implements State {

  private ArithemeticGame game;

    @Override
    public int getNum() {
        Random rnd = new Random();
        return rnd.nextInt(25) + 1;
    }

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

    @Override
    public void increaseDifficulty() {
        game.setState(game.getMediumState()); 
    }

    @Override
    public void decreaseDifficulty() {
        game.setState(game.getEasyState());
    }
    
}
