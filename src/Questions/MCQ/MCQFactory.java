package Questions.MCQ;

import Questions.QSource.QuestionSource;
import Questions.Question;
import Questions.QuestionEvaluator;
import Questions.QuestionFactory;
import Questions.QuestionRenderer;
public class MCQFactory implements QuestionFactory {
    private final QuestionSource source;

    public MCQFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        Question question = source.getQuestion();

        if (!(question instanceof MCQQuestion)) {
            throw new IllegalStateException("MCQFactory expected MCQQuestion but received " + question.getType());
        }

        return question;
    }

    @Override
    public QuestionRenderer createRenderer() {
        return new MCQRenderer();
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return new MCQEvaluator();
    }
}