//Concrete class implementing the interface directly
public class Student implements SchoolMember {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void performDuty() {
        System.out.println(name + " is studying and completing assignments.");
    }

    public void attend() {
        System.out.println(name + " is attending classes!");
    }
}
