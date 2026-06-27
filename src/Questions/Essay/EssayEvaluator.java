package Questions.Essay;

import Questions.Question;
import Questions.QuestionEvaluator;

public class EssayEvaluator implements QuestionEvaluator {

    @Override
    public int evaluate(Question question, String answer) {
        if (!(question instanceof EssayQuestion)) {
            throw new IllegalArgumentException("EssayEvaluator can only evaluate EssayQuestion.");
        }

        EssayQuestion essay = (EssayQuestion) question;

        String cleanedAnswer = answer.toLowerCase();
        int matchedKeywords = 0;

        for (String keyword : essay.getExpectedKeywords()) {
            if (cleanedAnswer.contains(keyword.toLowerCase())) {
                matchedKeywords++;
            }
        }

        if (matchedKeywords == essay.getExpectedKeywords().length) {
            return essay.getPoints();
        }

        if (matchedKeywords > 0) {
            return essay.getPoints() / 2;
        }

        return 0;
    }
}
