package Questions.QSource;

import Questions.Question;

public class BankQuestionSource implements QuestionSource {
    private final String questionType;

    public BankQuestionSource(String questionType) {
        this.questionType = questionType;
    }

    @Override
    public Question getQuestion() {
        return QuestionBank.getRandomQuestion(questionType);
    }

    @Override
    public String getSourceName() {
        return "Question Bank Mode";
    }
}
