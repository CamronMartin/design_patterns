package state;

import java.util.Random;

public class Easy implements State {

  private ArithemeticGame game;

  public Easy(ArithemeticGame game) {
    this.game = game;
  }

  @Override
  public int getNum() {
    Random rnd = new Random();
    return rnd.nextInt(10) + 1;
  }

  @Override
  public Operation getOperation() {
    Random rnd = new Random();
    int op = rnd.nextInt(2) + 1;
    if(op == 2) {
      return Operation.PLUS;
    } 
    return Operation.MINUS;
  }

  @Override
  public void increaseDifficulty() {
    game.setState(game.getMediumState());
  }

  @Override
  public void decreaseDifficulty() {
    
  }

}
