package Questions.Programming;

import Questions.Question;
import Questions.QuestionRenderer;

public class ProgrammingRenderer implements QuestionRenderer {

    @Override
    public void render(Question question) {
        if (!(question instanceof ProgrammingQuestion)) {
            throw new IllegalArgumentException("ProgrammingRenderer can only render ProgrammingQuestion.");
        }

        ProgrammingQuestion programming = (ProgrammingQuestion) question;

        System.out.println("[Programming Question]");
        System.out.println(programming.getText());
        System.out.println("Write your code below.");
    }
}
