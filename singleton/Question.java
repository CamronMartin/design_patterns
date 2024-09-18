package singleton;
import java.util.ArrayList;

public class Question {

  private String question;
  private ArrayList<String> answers;
  private int correctAnswer;

  public Question(String question, int correctAnswer, String[] answers) {
    this.question = question;
    this.correctAnswer = correctAnswer;
    
    System.out.println("answers size = " + answers.length);
    this.answers = new ArrayList<>();
    
    for(int i = 0; i < answers.length; ++i) {
      this.answers.add(answers[i]);
      System.out.println("This.answers i=" + i + " = " + this.answers.get(i));
    } 
    
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.question);
    // TODO: Figure out how to print the four answer choices
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
