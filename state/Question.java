package state;

/**
 * This class will be responsible for creating questions, checing the correct answer, 
 * and increasing/decreasing the score.
 * @author Camron Martin
 */
public class Question {

    private String question;
    private int answer;
    
    /**
     * This constructor will generate a new question, and also generate 
     * the correct answer for the question.
     * @param num1 a random number 
     * @param num2 a random number 
     * @param operation a random operation
     */
    public Question(int num1, int num2, Operation operation) {
        this.question = num1 + " " + operation.label + " " + num2;
        switch (operation) {
            case PLUS:
                this.answer = num1 + num2;
                break;
            case MINUS:
                this.answer = num1 - num2;
                break;
            case MULTIPLY:
                this.answer = num1 * num2;
                break;
            case DIVIDE:
                if (num2 != 0) {
                    this.answer = num1 / num2;  // Integer division
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            default:
                System.out.println("Unknown operation: " + operation);
        }
    }

    /**
     * This method will return the correct answer.
     * @return answer 
     */
    public int getAnswer() {
        return this.answer;
    }

    /**
     * This method will check whether the user's answer 
     * is correct or not.
     * @param answer users answer 
     */
    public boolean isCorrect(int answer) {
        return this.answer == answer;
    }

    /**
     * This method will print the question to the string.
     * @return sb the question
     */
    @Override
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        sb.append(question);
        return sb.toString();
    }
    
}
