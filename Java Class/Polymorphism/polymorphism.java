

/*
 Simply polymorphism means the many forms of doing a same task
 poly meand Many
 phism meand Form


 IN the given program workerInformation is a polymorphism of Worker Class and we use it
 for many purposes like we can print name only , name and age only, age and salary only
 by passing a value to it so it is very convient and easy and make thing eaily
 this is compile time program that dectect the error while compiling

 */

class Worker {
    String name;
    int age;
    int salary;

    public void workerInformation(String name) {
        System.out.println("Name: " + this.name);
    }

    public void workerInformation(String name, int age) {
        System.out.println("Name: " + this.name + "\n Age: " + this.age);
    }

    public void workerInformation(String name, int age, int salary) {
        System.out.println("Name: " + this.name + "\n Age: " + this.age + "\n salary: " + this.salary);
    }
    // We can nether  use "this"
}

public class polymorphism {
    public static void main(String[] args) {
        Worker workerInfo = new Worker();
        // workerInfo.name = "Updera Yadav";
        // workerInfo.age = 334;
        // workerInfo.salary = 23232;
        workerInfo.workerInformation(workerInfo.name = "Ashok Giri", workerInfo.age = 23, workerInfo.salary = 23000);
    }
}
