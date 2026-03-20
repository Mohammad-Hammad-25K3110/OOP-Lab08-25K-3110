package Lab08_Tasks.Task04;

public class Instructor implements User, InstructorActions {
    @Override
    public void login() {
        System.out.println("Instructor logged in.");
    }
    @Override
    public void uploadCourse() {
        System.out.println("Instructor uploaded a course.");
    }
}
