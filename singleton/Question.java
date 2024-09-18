package singleton;
import java.util.ArrayList;

public class Question {

  private String question;
  private ArrayList<String> answers;
  private int correctAnswer;

  public Question(String question, int correctAnswer, String[] answers) {
    this.question = question;
    this.correctAnswer = correctAnswer;

    for(int i = 0; i < answers.length; ++i) {
      this.answers.add(answers[i]);
    }

  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.question);
    return sb.toString();
  }

  public boolean isCorrect(int userAnswer) {
    return userAnswer == correctAnswer;
  }

  public String getCorrectAnswer() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.correctAnswer);
    return sb.toString();
  }
}
