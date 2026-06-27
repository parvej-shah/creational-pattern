package Questions.Programming;

import Questions.Question;
import Questions.QuestionEvaluator;

public class ProgrammingEvaluator implements QuestionEvaluator {

    @Override
    public int evaluate(Question question, String answer) {
        if (!(question instanceof ProgrammingQuestion)) {
            throw new IllegalArgumentException("ProgrammingEvaluator can only evaluate ProgrammingQuestion.");
        }

        ProgrammingQuestion programming = (ProgrammingQuestion) question;

        if (answer.toLowerCase().contains(programming.getExpectedKeyword().toLowerCase())) {
            return programming.getPoints();
        }

        return 0;
    }
}
