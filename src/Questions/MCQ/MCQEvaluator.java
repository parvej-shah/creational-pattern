package Questions.MCQ;

import Questions.Question;
import Questions.QuestionEvaluator;

public class MCQEvaluator implements QuestionEvaluator {

    @Override
    public int evaluate(Question question, String answer) {
        if (!(question instanceof MCQQuestion)) {
            throw new IllegalArgumentException("MCQEvaluator can only evaluate MCQQuestion.");
        }

        MCQQuestion mcq = (MCQQuestion) question;

        if (mcq.getCorrectOption().equalsIgnoreCase(answer.trim())) {
            return mcq.getPoints();
        }

        return 0;
    }
}
