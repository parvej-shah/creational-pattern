package Exams;

public class MidtermExam implements Exam {

    @Override
    public String getType() {
        return "Midterm Exam";
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Description: Single attempt, strict time limit, comprehensive configuration.");
    }
}