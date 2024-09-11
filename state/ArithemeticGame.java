package state;

/**
 * This class will be responsible for creating questions
 * and setting the state of the game.
 * @author Camron Martin
 */
public class ArithemeticGame {

    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    public ArithemeticGame() {
        this.score = 0;
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
        if(this.score >= 3) {
          this.state.increaseDifficulty();
          this.score = 0;
        }
    }

    public void decreaseScore() {
        this.score--;
        if(this.score <= -3) {
          this.state.decreaseDifficulty();  
          this.score = 0;
        }
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
