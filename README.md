School System Java Program

Description
This project demonstrates the use of interfaces, abstract classes, and concrete classes in Java using a school system. The program consists of different school members (teachers and students) with specific behaviors.

Features
- Interface (SchoolMember): Defines core methods for school members.
- Abstract Class (Staff): Implements shared functionality for staff members.
- Concrete Classes (Teacher, Student): Implements specific behaviors.
- Main Class (Main): Creates objects and tests functionality.

Class Structure
- SchoolMember(Interface): Defines performDuty() and attend() methods.
- Staff(Abstract Class): Implements attend() and provides takeBreak().
- Teacher(Concrete Class): Extends Staff, implements performDuty(), and overrides attend().
- Student(Concrete Class): Implements SchoolMember and provides specific behavior.

Use
1. Clone or download the repository.
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Ensure all class files are inside the `src` folder.
4. Run Main.java to execute the program.

Output
Mr. Smith is teaching students.
Mr. Smith is taking a break...
Mr. Smith is attending a staff meeting!
Alice is studying and completing assignments.
Alice is attending classes!


Technologies Used
- Java
- IntelliJ IDEA (Recommended IDE)

Author
Joy Andati

