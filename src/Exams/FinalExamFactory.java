package Exams;

public class FinalExamFactory extends ExamFactory {

    @Override
    public Exam createExam() {
        return new FinalExam();
    }
}