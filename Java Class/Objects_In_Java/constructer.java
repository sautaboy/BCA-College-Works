
class person {
    String name;
    int age;
    int salary;

    person(String userName) {
        name = userName;
    }

    person(String name, int userAge) {
        age = userAge;
        age = userAge;
    }

    person(String userName, int userAge, int userSalary) {
        name = userName;
        age = userAge;
        salary = userSalary;
    }

    void displayFunction() {
        System.out.println("User Name: " + name + "\nUser Age: " + age + "\nUser Salaray " + salary);
    }
}

class Constructer {
    public static void main(String[] args) {
        person personInformation = new person("Jeshika", 20, 16000);
        personInformation.displayFunction();
    }
}
