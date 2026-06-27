package Questions.Essay;

import Questions.QSource.QuestionSource;
import Questions.Question;
import Questions.QuestionEvaluator;
import Questions.QuestionFactory;
import Questions.QuestionRenderer;

public class EssayFactory implements QuestionFactory {
    private final QuestionSource source;

    public EssayFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        Question question = source.getQuestion();

        if (!(question instanceof EssayQuestion)) {
            throw new IllegalStateException("EssayFactory expected EssayQuestion but received " + question.getType());
        }

        return question;
    }

    @Override
    public QuestionRenderer createRenderer() {
        return new EssayRenderer();
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return new EssayEvaluator();
    }
}