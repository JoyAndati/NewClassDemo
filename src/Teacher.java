// Concrete class that extends the abstract class and implements the interface
public class Teacher extends Staff {

    public Teacher(String name, int experience) {
        super(name, experience);
    }

    // Implementing the abstract method from the interface
    public void performDuty() {
        System.out.println(name + " is teaching students.");
    }

    // Overriding attend method to provide specific behavior
    @Override
    public void attend() {
        System.out.println(name + " is attending a staff meeting!");
    }
}
