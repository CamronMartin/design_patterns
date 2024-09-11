package state;

public class Question {

    private String question;
    private int answer;

    public Question(int num1, int num2, Operation operation) {
        this.question = num1 + operation.label + num2; 
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
