
class Student2 {
    int age;
    String name;

    Student2(String studentName, int studentAge) {
        age = studentAge;
        name = studentName;
    }

    void display() {
        System.out.println("Student2 Name: " + name + "\n" + "Student2 Age: " + age);
    }
}

/*
 * Example of this keyword
 */
class Student {

    int age;// this
    String name; // this

    Student(String name, int age) {
        /* this */ this.name = name;
        /* this */this.age = age;
    }

    void display() {
        System.out.println("Student Name: " + name + "\n" + "Student age: " + age);
    }
}

public class thisKeyword {
    public static void main(String[] args) {

        // calling Student constructor

        // this is calling by this keyword
        Student student = new Student("Ashok Giri", 23);
        student.display();

        // calling Student2 constructor

        // this is normal 
        Student2 student2 = new Student2("Sauta", 23);
        student2.display();
    }
}