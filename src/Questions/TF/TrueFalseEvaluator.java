package Questions.TF;

import Questions.Question;
import Questions.QuestionEvaluator;

public class TrueFalseEvaluator implements QuestionEvaluator {

    @Override
    public int evaluate(Question question, String answer) {
        if (!(question instanceof TrueFalseQuestion)) {
            throw new IllegalArgumentException("TrueFalseEvaluator can only evaluate TrueFalseQuestion.");
        }

        TrueFalseQuestion tf = (TrueFalseQuestion) question;

        String cleanedAnswer = answer.trim().toLowerCase();

        boolean userAnswer;

        if (cleanedAnswer.equals("true") || cleanedAnswer.equals("t")) {
            userAnswer = true;
        } else if (cleanedAnswer.equals("false") || cleanedAnswer.equals("f")) {
            userAnswer = false;
        } else {
            return 0;
        }

        if (userAnswer == tf.getCorrectAnswer()) {
            return tf.getPoints();
        }

        return 0;
    }
}
