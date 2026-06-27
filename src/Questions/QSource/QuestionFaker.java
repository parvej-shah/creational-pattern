package Questions.QSource;

import Questions.Essay.EssayQuestion;
import Questions.MCQ.MCQQuestion;
import Questions.Programming.ProgrammingQuestion;
import Questions.Question;
import Questions.TF.TrueFalseQuestion;

import java.util.Random;

public class QuestionFaker {
    private static final Random random = new Random();

    public static Question generateQuestion(String questionType) {
        int randomNumber = random.nextInt(1000);

        if (questionType.equalsIgnoreCase("MCQ")) {
            return new MCQQuestion(
                    "Generated MCQ #" + randomNumber + ": Which concept hides object creation logic?",
                    new String[]{"Inheritance", "Factory Method", "Looping", "Exception Handling"},
                    "B",
                    2,
                    "Medium"
            );
        }

        if (questionType.equalsIgnoreCase("TRUE_FALSE")) {
            return new TrueFalseQuestion(
                    "Generated True/False #" + randomNumber + ": Dependency Injection helps reduce tight coupling.",
                    true,
                    1,
                    "Easy"
            );
        }

        if (questionType.equalsIgnoreCase("ESSAY")) {
            return new EssayQuestion(
                    "Generated Essay #" + randomNumber + ": Discuss how design patterns improve maintainability.",
                    new String[]{"design", "maintainability", "flexible"},
                    10,
                    "Hard"
            );
        }

        if (questionType.equalsIgnoreCase("PROGRAMMING")) {
            return new ProgrammingQuestion(
                    "Generated Programming #" + randomNumber + ": Write a method that returns the smaller of two numbers.",
                    "Math.min",
                    20,
                    "Hard"
            );
        }

        throw new IllegalArgumentException("Unknown question type: " + questionType);
    }
}
