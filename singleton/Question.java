package singleton;
import java.util.ArrayList;

/**
 * This class will be responsible for creating a Question and checking
 * whether the user inputs the correct answers.
 * @author Camron Martin
 */
public class Question {

  private String question;
  private ArrayList<String> answers;
  private int correctAnswer;

  /**
   * This constructor will create a question with a list of answers 
   * to choose from. 
   * @param question A question to ask.
   * @param correctAnswer The correct answer to the questions.
   * @param answers An array of answers to choose from.
   */
  public Question(String question, int correctAnswer, String[] answers) {
    this.question = question;
    this.correctAnswer = correctAnswer; 
    this.answers = new ArrayList<>();
    
    for(int i = 0; i < answers.length; ++i) {
      this.answers.add(answers[i]);
    } 
    
  }

  /**
   * This will print out the question along with 
   * the four answers to choose from.
   * @return String question and answers 
   */
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.question).append("\n");
    for(int i = 0; i < 4; ++i) {
      sb.append( (i+1) + ". ").append(answers.get(i)).append("\n");
    }
    return sb.toString();
  }

  /**
   * This method will check wether the user 
   * got the correct answer or not 
   * @return boolean correct or incorrect
   */
  public boolean isCorrect(int userAnswer) {
    return userAnswer == correctAnswer + 1;
  }

  /**
   * This will output the correct answer
   * @return String correct answer 
   */
  public String getCorrectAnswer() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.correctAnswer + 1);
    return sb.toString();
  }
}
