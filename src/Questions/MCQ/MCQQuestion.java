package Questions.MCQ;

import Questions.Question;

public class MCQQuestion implements Question {
    private final String text;
    private final String[] options;
    private final String correctOption;
    private final int points;
    private final String difficulty;

    public MCQQuestion(String text, String[] options, String correctOption, int points, String difficulty) {
        this.text = text;
        this.options = options;
        this.correctOption = correctOption;
        this.points = points;
        this.difficulty = difficulty;
    }

    @Override
    public String getType() {
        return "MCQ";
    }

    @Override
    public String getText() {
        return text;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectOption() {
        return correctOption;
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