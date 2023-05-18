class person {
    String name;
    int age;

    public void name() {
        System.out.println("The Name of a Person is " + this.name);
    }

    public void age() {
        System.out.println("The Age of a Person is " + this.age);
    }
}

class Student {
    String name;
    String age;
    String description;

    public void studentInfo() {
        System.out.println("The name of the Student is " + this.name + " and his age is " + this.age
                + " And" + this.description);
    }
}

public class object {

    public static void main(String args[]) {
        // This is for class PenF
        person person1 = new person();
        person1.name = "Ashok Giri";
        person person2 = new person();
        person2.name = "Sauta Boy";

        // This is for clas Student

        Student student1 = new Student();
        student1.name = "Jenisha";
        student1.age = "23";
        student1.description = " is very good";

        student1.studentInfo();
    }
}
