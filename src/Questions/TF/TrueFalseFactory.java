package Questions.TF;

import Questions.QSource.QuestionSource;
import Questions.Question;
import Questions.QuestionEvaluator;
import Questions.QuestionFactory;
import Questions.QuestionRenderer;
public class TrueFalseFactory implements QuestionFactory {
    private final QuestionSource source;

    public TrueFalseFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        Question question = source.getQuestion();

        if (!(question instanceof TrueFalseQuestion)) {
            throw new IllegalStateException("TrueFalseFactory expected TrueFalseQuestion but received " + question.getType());
        }

        return question;
    }

    @Override
    public QuestionRenderer createRenderer() {
        return new TrueFalseRenderer();
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return new TrueFalseEvaluator();
    }
}
