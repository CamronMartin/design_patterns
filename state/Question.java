package state;

public class Question {

    private String question;
    private int answer;

    public Question(int num1, int num2, Operation operation) {
        
    }

    public int getAnswer() {
        return this.answer;
    }

    public boolean isCorrect(int answer) {
        return this.answer == answer;
    }
    
}
