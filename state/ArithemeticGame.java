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

    /*
     * This constructor will create an instance of ArithemeticGame and
     * set the state to Easy.
     */
    public ArithemeticGame() {
        this.score = 0;
        this.easyState = new Easy(this);
        this.mediumState = new Medium(this);
        this.hardState = new Hard(this);
        this.state = this.easyState;
        System.out.println("Initial state set too " + this.state);
    }
    /**
     * This method will return a new question for the ArithemeticGame
     * @return a new question 
     */
    public Question getQuestion() {
        Question question = new Question(this.state.getNum(), this.state.getNum(), this.state.getOperation());
        return question;
    }

    /**
     * This method will increase the score by one, and also increase the current level.
     */
    public void increaseScore() {
        this.score++;
        if(this.score >= 3) {
          this.state.increaseDifficulty();
          this.score = 0;
        }
    }
    
    /**
     * This method will decrease the score by one, and also decrease the current level.
     */
    public void decreaseScore() {
        this.score--;
        if(this.score <= -3) {
          this.state.decreaseDifficulty();  
          this.score = 0;
        }
    }

    /**
     * This method will change the current state 
     * @param state What state you want to change to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * This method will return the easy state 
     * @return easyState 
     */
    public State getEasyState() {
        return this.easyState;
    }

    /**
     * This method will return the medium state.
     * @return mediumState
     */
    public State getMediumState() {
        return this.mediumState;
    }

    /**
     * This method will return the hard state
     * @return hardState
     */
    public State getHardState() {
        return this.hardState;
    }
}
