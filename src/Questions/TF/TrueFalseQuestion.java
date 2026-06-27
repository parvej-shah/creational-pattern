package Questions.TF;

import Questions.Question;

public class TrueFalseQuestion implements Question {
    private final String text;
    private final boolean correctAnswer;
    private final int points;
    private final String difficulty;

    public TrueFalseQuestion(String text, boolean correctAnswer, int points, String difficulty) {
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.points = points;
        this.difficulty = difficulty;
    }

    @Override
    public String getType() {
        return "True/False";
    }

    @Override
    public String getText() {
        return text;
    }

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public String getDifficulty() {
        return difficulty;
    }
}