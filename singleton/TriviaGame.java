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

    // TODO: Implement way for questions to not repeat
    this.questions = new ArrayList<>();
    for(int i = 0; i < DataLoader.getTriviaQuestions().size(); ++i) {
      this.questions.add(DataLoader.getTriviaQuestions().get(i));
    }
    rand = new Random();
    int pos = rand.nextInt(questions.size());
    return this.questions.get(pos);
  }

  public boolean hasMoreQuestions() {
    return questions.size() > 0;
  }

  public void winRound() {
    this.score++;
  }

  public void loseRound() {
    this.score--;
  }

  public String getScores() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.score);
    return sb.toString();
  }




}

