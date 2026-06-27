package Exams;

public class MidtermExamFactory extends ExamFactory {

    @Override
    public Exam createExam() {
        return new MidtermExam();
    }
}