package Exams;

public class FinalExam implements Exam {

    @Override
    public String getType() {
        return "Final Exam";
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Description: High security, high stakes, definitive final evaluation.");
    }
}