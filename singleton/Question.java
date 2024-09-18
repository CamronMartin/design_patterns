package singleton;
import java.util.ArrayList;

public class Question {

  private String question;
  private ArrayList<String> answers;
  private int correctAnswer;

  public Question(String question, int correctAnswer, String[] answers) {
    this.question = question;
    this.correctAnswer = correctAnswer; 
    this.answers = new ArrayList<>();
    
    for(int i = 0; i < answers.length; ++i) {
      this.answers.add(answers[i]);
    } 
    
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.question).append("\n");
    for(int i = 0; i < 4; ++i) {
      sb.append( (i+1) + ". ").append(answers.get(i)).append("\n");
    }
    return sb.toString();
  }

  public boolean isCorrect(int userAnswer) {
    return userAnswer == correctAnswer + 1;
  }

  public String getCorrectAnswer() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.correctAnswer + 1);
    return sb.toString();
  }
}
