class nestedfor {
    public static void main(String[] args) {
        int a, b;

        // printing the table upto 10
        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++) {
                System.out.println(a+"*"+b+"="+a*b);
                System.out.println("\n");
            }
        }
    }
}