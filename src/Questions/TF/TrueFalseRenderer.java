package Questions.TF;

import Questions.Question;
import Questions.QuestionRenderer;

public class TrueFalseRenderer implements QuestionRenderer {

    @Override
    public void render(Question question) {
        if (!(question instanceof TrueFalseQuestion)) {
            throw new IllegalArgumentException("TrueFalseRenderer can only render TrueFalseQuestion.");
        }

        TrueFalseQuestion tf = (TrueFalseQuestion) question;

        System.out.println("[True/False Question]");
        System.out.println(tf.getText());
        System.out.println("Answer: True or False");
    }
}
