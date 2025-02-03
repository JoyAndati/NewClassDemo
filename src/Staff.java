// Abstract class providing some common functionality
public abstract class Staff implements SchoolMember {
    String name;
    int experience;

    // Constructor
    public Staff(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    // Concrete method
    void takeBreak() {
        System.out.println(name + " is taking a break...");
    }

    // Implementing attend method with default behavior
    public void attend() {
        System.out.println(name + " is attending school...");
    }
}
