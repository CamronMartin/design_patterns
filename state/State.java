package state;

/**
 * This class will represent a state in ArithemeticGame where the difficulty 
 * can change accordingly. 
 */
public interface State {


    /**
    * This number will return a random number depending on which 
    * difficulty is selected.
    * @return random number 
    */
    public int getNum();

    /**
     * This method will return a random operation depending on which 
     * difficulty is selected.
     */
    public Operation getOperation();
    
    /**
     * This method will increase the difficulty of the game.
     */
    public void increaseDifficulty();

    /**
     * This method will decrease the difficulty of the game.
     */ 
    public void decreaseDifficulty();

}
