package state;

public class Question {

    private String question;
    private int answer;

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

    public int getAnswer() {
        return this.answer;
    }

    public boolean isCorrect(int answer) {
        return this.answer == answer;
    }

    @Override
    public String toString() {
        
        StringBuffer sb = new StringBuffer();
        sb.append(question);
        return sb.toString();
    }
    
}
