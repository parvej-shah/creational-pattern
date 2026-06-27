package Questions.Essay;

import Questions.Question;

public class EssayQuestion implements Question {
    private final String text;
    private final String[] expectedKeywords;
    private final int points;
    private final String difficulty;

    public EssayQuestion(String text, String[] expectedKeywords, int points, String difficulty) {
        this.text = text;
        this.expectedKeywords = expectedKeywords;
        this.points = points;
        this.difficulty = difficulty;
    }

    @Override
    public String getType() {
        return "Essay";
    }

    @Override
    public String getText() {
        return text;
    }

    public String[] getExpectedKeywords() {
        return expectedKeywords;
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
