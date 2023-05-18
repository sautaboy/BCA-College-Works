
class Student {
    String name;
    int age;
    int rollNumber;
    String section;

    Student(String name, int age, int rollNumber, String section) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.section = section;
    }

    void displayStudentInformation() {
        System.out.println("Name: " + name + "\n Age: " + age
                + "\n Section :" + section + "\nRoll Number" + rollNumber);
    }

    // Now making a constructort that copy the information of the Student
    Student(Student secondStudent) {
        this.name = secondStudent.name;
        this.age = secondStudent.age;
        this.rollNumber = secondStudent.rollNumber;
        this.section = secondStudent.section;
    }

}

public class copyCatConst {
    public static void main(String[] args) {
        Student firstStudent = new Student("Jems Shrestha", 20, 02, "B");
        firstStudent.displayStudentInformation();
        System.out.println("The First Information is Copied By secondStudent");
        Student secondStudent = (firstStudent);
        secondStudent.displayStudentInformation();

    }
}
