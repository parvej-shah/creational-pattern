package Exams;

public abstract class ExamFactory {

    public abstract Exam createExam();

    public void showCreatedExam() {
        Exam exam = createExam();

        System.out.println("=======================================");
        System.out.println("Exams CREATED SUCCESSFULLY");
        System.out.println("=======================================");
        exam.displayInfo();
        System.out.println("=======================================");
    }
}