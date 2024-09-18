package singleton;

import java.util.Random;
import java.util.ArrayList;

/**
 * This class will be responsible for handling everything for the triviaGame 
 * so it will only be instansiated once. 
 * @author Camron Martin
 */
public class TriviaGame {
  
  private static TriviaGame triviaGame;
  private int score;
  private int numGames;
  private Random rand;
  private ArrayList<Question> questions;

  /**
   * This is a private constructor and will not be called, it will only 
   * initialize the rand variable and questions ArrayList
   */
  private TriviaGame() {
    this.questions = new ArrayList<>(DataLoader.getTriviaQuestions());
    rand = new Random();
  }

  /**
   * This method will be responsible for instansiating the TriviaGame 
   * instead of using the Constructor
   * @return TriviaGame
   */
  public static TriviaGame getInstance() {
    if (triviaGame == null) {
      System.out.println("Creating new TriviaGame");
      triviaGame = new TriviaGame();
    }
    return triviaGame;
  }

  /**
   * This method will print a question and then remove it so it 
   * will not be asked again 
   * @return question Question to be asked 
   */
  public Question getQuestion() {
    if(!hasMoreQuestions()) {
      System.out.println("No more questions available.");
      System.exit(-1); 
      return null; 
    }
    numGames++;
    int pos = rand.nextInt(questions.size());
    return this.questions.remove(pos);
  }


  /**
   * This method will check whether the question array list 
   * is empty or not 
   * @return boolean empty or not
   */
  public boolean hasMoreQuestions() {
    return this.questions.size() > 0;
  }

  /**
   * this will inrease the score if they 
   * get the answer correct 
   */
  public void winRound() {
    this.score++;
  }

  /**
   * This will decrease the score if they 
   * get the answer inccorect 
   */
  public void loseRound() {
    this.score--;
  }

  /**
   * This will return the amount of answers they 
   * got correct out of however many questions 
   * has been asked. 
   */
  public String getScores() {
    StringBuilder sb = new StringBuilder();
    sb.append("You scored " + (this.score + 1) + "/" + numGames);
    return sb.toString();
  }




}

