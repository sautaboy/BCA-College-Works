class ifelse {
    public static void main(String args[]) {
        int age = 20;

        /*
         * Now Checking the age , whether the use is 18 or not
         * if user is not 18 he/she cannot vote else can vote
         */
        if (age < 18) {
            System.out.println("You Cannot Vote ");
        } else {
            System.out.println("You can Vote ");
        }
    }
}