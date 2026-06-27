package Questions.Essay;

import Questions.Question;
import Questions.QuestionRenderer;

public class EssayRenderer implements QuestionRenderer {

    @Override
    public void render(Question question) {
        if (!(question instanceof EssayQuestion)) {
            throw new IllegalArgumentException("EssayRenderer can only render EssayQuestion.");
        }

        EssayQuestion essay = (EssayQuestion) question;

        System.out.println("[Essay Question]");
        System.out.println(essay.getText());
        System.out.println("Write a descriptive answer.");
    }
}
