package Questions.Programming;

import Questions.Question;

public class ProgrammingQuestion implements Question {
    private final String text;
    private final String expectedKeyword;
    private final int points;
    private final String difficulty;

    public ProgrammingQuestion(String text, String expectedKeyword, int points, String difficulty) {
        this.text = text;
        this.expectedKeyword = expectedKeyword;
        this.points = points;
        this.difficulty = difficulty;
    }

    @Override
    public String getType() {
        return "Programming";
    }

    @Override
    public String getText() {
        return text;
    }

    public String getExpectedKeyword() {
        return expectedKeyword;
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
