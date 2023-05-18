

class A {
    int age;
    int salary;

    A(int newAge, int newSalary) {
        age = newAge;
        salary = newSalary;
    }

    A(int newAge) {
        age = newAge;
    }

    void display() {
        System.out.println("The age is " + age + "\nThe salary is " + salary);
    }
}

public class overloading {
    public static void main(String[] args) {
        A objectA = new A(12, 12000);
        objectA.display();
    }

}
