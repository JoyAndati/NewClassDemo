// Main class
public class Main {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher("Mr. Smith", 10); // Creating an object of the concrete class
        myTeacher.performDuty(); // Calling implemented method
        myTeacher.takeBreak(); // Calling method from abstract class
        myTeacher.attend(); // Calling overridden method

        Student myStudent = new Student("Alice"); // Creating an object of Student class
        myStudent.performDuty();
        myStudent.attend();
    }
}
