class forloop {
    public static void main(String[] args) {
        int a;
        // printing from 1 to 10

        for (a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        // print the table of 5
        int b = 1;
        for (b = 1; b <= 10; b++) {
            System.out.println("5 * " + b + "=" + (5 * b));
        }

        // calculate sum upto 9 like(1+2+3+4+5+6+7+8+9)
        int c, sum = 0;
        for (c = 1; c <= 9; c++) {
            sum = sum + c;
        }
        System.out.println(sum);
    }
}