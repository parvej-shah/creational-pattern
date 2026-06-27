package Questions.MCQ;

import Questions.Question;
import Questions.QuestionRenderer;

public class MCQRenderer implements QuestionRenderer {

    @Override
    public void render(Question question) {
        if (!(question instanceof MCQQuestion)) {
            throw new IllegalArgumentException("MCQRenderer can only render MCQQuestion.");
        }

        MCQQuestion mcq = (MCQQuestion) question;

        System.out.println("[MCQ Question]");
        System.out.println(mcq.getText());

        String[] options = mcq.getOptions();

        for (int i = 0; i < options.length; i++) {
            char optionLetter = (char) ('A' + i);
            System.out.println(optionLetter + ") " + options[i]);
        }
    }
}
