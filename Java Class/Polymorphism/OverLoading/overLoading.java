
class Math {
    int a, b;

    Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void sum() {
        System.out.println("Sum of a and b: " + (a + b));
    }

    void sub() {
        System.out.println("Sub of a and b: " + (a - b));
    }

    void mul() {
        System.out.println("Multiply of a and b: " + a * b);
    }

    void div() {
        System.out.println("Division of a and b: " + a / b);
    }
}

public class overLoading {
    public static void main(String[] args) {
        Math math = new Math(4, 2);
        // for sum
        math.sum();
        // for sub
        math.sub();
        // for mul
        math.mul();
        // for div
        math.div();
    }
}