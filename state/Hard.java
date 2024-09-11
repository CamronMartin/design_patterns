package state;

import java.util.Random;

public class Hard implements State {

    private ArithemeticGame game;

    @Override
    public int getNum() {
        Random rnd = new Random();
        return rnd.nextInt(50) + 1;
    }

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

    @Override
    public void increaseDifficulty() {
        this.game.setState(game.getHardState());
    }

    @Override
    public void decreaseDifficulty() {
        this.game.setState(game.getMediumState());
    }
    
}
