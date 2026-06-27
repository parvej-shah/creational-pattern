package Exams;

public class PracticeQuiz implements Exam {

    @Override
    public String getType() {
        return "Practice Quiz";
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Description: Unlimited attempts, low stakes, short duration.");
    }
}