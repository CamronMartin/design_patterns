package state;

public class ArithemeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score = 0;

    public ArithemeticGame() {
        this.easyState = new Easy(this);
        this.mediumState = new Medium(this);
        this.hardState = new Hard(this);
        
        this.state = this.easyState;
        System.out.println("Initial state set too " + this.state);
    }

    public Question getQuestion() {
        Question question = new Question(this.state.getNum(), this.state.getNum(), this.state.getOperation());
        return question;
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
