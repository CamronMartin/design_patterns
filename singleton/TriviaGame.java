package singleton;

import java.util.Random;
import java.util.ArrayList;

public class TriviaGame {
  
  private static TriviaGame triviaGame;
  private int score;
  private int numGames;
  private Random rand;
  private ArrayList<Question> questions;

  private TriviaGame() {}

  public static TriviaGame getInstance() {
    if (triviaGame == null) {
      System.out.println("Creating new TriviaGame");
      triviaGame = new TriviaGame();
    }
    return triviaGame;
  }

  public Question getQuestion() {
    rand = new Random();
    int pos = rand.nextInt(questions.size() - 1);
    return this.questions.get(pos);
  }

  public boolean hasMoreQuestions() {
    return questions.size() > 0;
  }

  public void winRound() {

  }

  public void loseRound() {

  }

  public String getScores() {

  }




}

