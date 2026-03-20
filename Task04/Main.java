package Lab08_Tasks.Task04;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.login();
        Instructor instructor = new Instructor();
        instructor.login();
        instructor.uploadCourse();
    }
}
