package Questions.Programming;

import Questions.QSource.QuestionSource;
import Questions.Question;
import Questions.QuestionEvaluator;
import Questions.QuestionFactory;
import Questions.QuestionRenderer;
public class ProgrammingFactory implements QuestionFactory {
    private final QuestionSource source;

    public ProgrammingFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        Question question = source.getQuestion();

        if (!(question instanceof ProgrammingQuestion)) {
            throw new IllegalStateException("ProgrammingFactory expected ProgrammingQuestion but received " + question.getType());
        }

        return question;
    }

    @Override
    public QuestionRenderer createRenderer() {
        return new ProgrammingRenderer();
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return new ProgrammingEvaluator();
    }
}