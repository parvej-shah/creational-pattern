import Exams.Exam;
import Exams.ExamConfiguration;
import Exams.ExamFactory;
import Exams.MidtermExamFactory;
import Questions.Essay.EssayFactory;
import Questions.MCQ.MCQFactory;
import Questions.Programming.ProgrammingFactory;
import Questions.QSource.BankQuestionSource;
import Questions.QSource.QuestionSource;
import Questions.Question;
import Questions.QuestionFactory;
import Questions.TF.TrueFalseFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Factory Method: choose exam type
        ExamFactory examFactory = new MidtermExamFactory();
        Exam exam = examFactory.createExam();

        // 2. Question Source Strategy: choose sourcing mode
        // We are using Bank mode for all question types in this final demo.
        QuestionSource mcqSource = new BankQuestionSource("MCQ");
        QuestionSource essaySource = new BankQuestionSource("ESSAY");
        QuestionSource programmingSource = new BankQuestionSource("PROGRAMMING");
        QuestionSource trueFalseSource = new BankQuestionSource("TRUE_FALSE");

        String sourceStrategyName = mcqSource.getSourceName();

        // 3. Abstract Factory + Dependency Injection
        QuestionFactory mcqFactoryOne = new MCQFactory(mcqSource);
        QuestionFactory mcqFactoryTwo = new MCQFactory(new BankQuestionSource("MCQ"));
        QuestionFactory essayFactory = new EssayFactory(essaySource);
        QuestionFactory programmingFactory = new ProgrammingFactory(programmingSource);
        QuestionFactory trueFalseFactory = new TrueFalseFactory(trueFalseSource);

        // 4. Builder Pattern: build immutable exam configuration
        ExamConfiguration config = new ExamConfiguration.Builder()
                .title("OOP Midterm Exam")
                .duration(60)
                .passingScore(50)
                .enableNegativeMarking()
                .enableQuestionShuffle()
                .enableAutoSubmit()
                .disableCalculator()
                .build();

        // 5. Generate questions
        List<Question> questions = new ArrayList<>();

        questions.add(mcqFactoryOne.createQuestion());
        questions.add(mcqFactoryTwo.createQuestion());
        questions.add(essayFactory.createQuestion());
        questions.add(programmingFactory.createQuestion());
        questions.add(trueFalseFactory.createQuestion());

        // 6. Print final dashboard
        printDashboard(exam, config, sourceStrategyName, questions);
    }

    private static void printDashboard(
            Exam exam,
            ExamConfiguration config,
            String sourceStrategyName,
            List<Question> questions
    ) {
        System.out.println("=====================================================================");
        System.out.println("EXAM CREATED SUCCESSFULLY");
        System.out.println("=====================================================================");

        System.out.println("Type: " + exam.getType());
        System.out.println("Title: " + config.getTitle());
        System.out.println("Duration: " + config.getDuration() + " minutes");
        System.out.println("Passing Score: " + config.getPassingScore() + " Marks");

        System.out.println("Configuration Profiles:");
        System.out.println((config.isNegativeMarking() ? "✓" : "✗") + " Negative Marking Enabled");
        System.out.println((config.isQuestionShuffle() ? "✓" : "✗") + " Question Shuffle Activated");
        System.out.println((config.isCalculatorAllowed() ? "✓" : "✗") + " Embedded Calculator Allowed");
        System.out.println((config.isAutoSubmit() ? "✓" : "✗") + " Auto-Submit On Timeout");

        System.out.println("Question Sourcing Strategy: " + sourceStrategyName);

        System.out.println("Compiled Structural Components:");

        for (Question question : questions) {
            System.out.println(
                    "- [Type: " + question.getType() + "] "
                            + "Points: " + question.getPoints()
                            + " Difficulty: " + question.getDifficulty()
            );
        }

        System.out.println("=====================================================================");
    }
}