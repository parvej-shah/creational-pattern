package Questions.QSource;

import Questions.Question;

public class FakerQuestionSource implements QuestionSource {
    private final String questionType;

    public FakerQuestionSource(String questionType) {
        this.questionType = questionType;
    }

    @Override
    public Question getQuestion() {
        return QuestionFaker.generateQuestion(questionType);
    }

    @Override
    public String getSourceName() {
        return "Faker Mode";
    }
}
