package Questions.QSource;

import Questions.Essay.EssayQuestion;
import Questions.MCQ.MCQQuestion;
import Questions.Programming.ProgrammingQuestion;
import Questions.Question;
import Questions.TF.TrueFalseQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuestionBank {
    private static final Random random = new Random();

    public static Question getRandomQuestion(String questionType) {
        List<Question> questions = getQuestionsByType(questionType);

        int index = random.nextInt(questions.size());
        return questions.get(index);
    }

    private static List<Question> getQuestionsByType(String questionType) {
        if (questionType.equalsIgnoreCase("MCQ")) {
            return Arrays.asList(
                    new MCQQuestion(
                            "Which design pattern creates families of related objects?",
                            new String[]{"Factory Method", "Abstract Factory", "Builder", "Singleton"},
                            "B",
                            2,
                            "Medium"
                    ),
                    new MCQQuestion(
                            "Which pattern is best for building complex objects step by step?",
                            new String[]{"Adapter", "Builder", "Observer", "Proxy"},
                            "B",
                            2,
                            "Easy"
                    )
            );
        }

        if (questionType.equalsIgnoreCase("TRUE_FALSE")) {
            return Arrays.asList(
                    new TrueFalseQuestion(
                            "Factory Method and Abstract Factory are both creational patterns.",
                            true,
                            1,
                            "Easy"
                    ),
                    new TrueFalseQuestion(
                            "Builder is mainly used to create families of related objects.",
                            false,
                            1,
                            "Medium"
                    )
            );
        }

        if (questionType.equalsIgnoreCase("ESSAY")) {
            return Arrays.asList(
                    new EssayQuestion(
                            "Explain why Abstract Factory is useful in an online exam system.",
                            new String[]{"family", "renderer", "evaluator"},
                            10,
                            "Hard"
                    ),
                    new EssayQuestion(
                            "Explain the benefit of dependency injection in question sourcing.",
                            new String[]{"source", "injection", "flexible"},
                            10,
                            "Medium"
                    )
            );
        }

        if (questionType.equalsIgnoreCase("PROGRAMMING")) {
            return Arrays.asList(
                    new ProgrammingQuestion(
                            "Write a Java method that returns the larger of two numbers.",
                            "Math.max",
                            20,
                            "Hard"
                    ),
                    new ProgrammingQuestion(
                            "Write a Java method that checks whether a number is even.",
                            "%",
                            20,
                            "Medium"
                    )
            );
        }

        throw new IllegalArgumentException("Unknown question type: " + questionType);
    }
}
