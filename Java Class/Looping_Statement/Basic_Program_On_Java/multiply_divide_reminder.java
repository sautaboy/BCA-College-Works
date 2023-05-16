class multiply_divide_reminder {
    public static void main(String args[]) {
        int a = 5, b = 8, c = 78;
        // Findind The Multiplication of a,b,c
        // Creting the container variable that stores the multiplication of all a,b,c
        // variables
        int multiplication;
        multiplication = (a + b + c);

        // Showing out the result on Screen
        System.out.println("The Sum Of All Three Variables is : " + multiplication);

        // to get the multiplication of all three variables on screen ,, ho to terminal
        // and write
        // javac multiply_divide_reminder(className).java
        // if error is not occured type
        // java multiply_divide_reminder(className)

        // Finding Teh Division of a and b
        int div;
        div = a / b;
        System.out.println("The Division a and b is : " + div);

        // finding the remonder of a and b
        int reminder;
        reminder = a % b;
            System.out.println("The Reminder a and b is : " + reminder);
    }
}