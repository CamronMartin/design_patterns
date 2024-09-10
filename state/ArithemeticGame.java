package state;

public class ArithemeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    public Question getQuestion() {
        return new Question(state.getNum(), state.getNum(), state.getOperation());
    }

    public void increaseScore() {
        this.score++;
    }

    public void decreaseScore() {
        this.score--;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEasyState() {
        return this.easyState;
    }

    public State getMediumState() {
        return this.mediumState;
    }

    public State getHardState() {
        return this.hardState;
    }






}
