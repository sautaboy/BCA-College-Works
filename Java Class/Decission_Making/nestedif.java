
class nestedif {
    public static void main(String args[]) {
        int age = 20;
        /*
         * If user is 80 above he is Very Old ,,
         * if user is less than 80 and greater that 40 he is young ,,
         * if user is less than 40 and greater than 20 he is Very Young...
         * if user is less than 20 he is teenagers
         */

        if (age > 20 && age < 40) {
            System.out.print("The user is very Young");
        } else {
            if (age > 40 && age < 80) {
                System.out.print("The user is Young");
            } else {
                if (age <= 20) {
                    System.out.println("The user is teneger");
                } else {
                    System.out.println("User is Very Old");
                }
            }
        }
    }
}