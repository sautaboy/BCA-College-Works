
class A {
    int i;
    int j;

    A(int x, int y) {
        i = x;
        j = y;
    }

    void display() {
        // System.out.println("i:" + i + " j:" + j);

    }

}

class B extends A {
    int k;

    B(int x, int y, int z) {
        super(x, y);
        k = z;
    }

    void display() {
        super.display();// this will call class A
        System.out.println("\nI:" + i + "\nJ:" + j + "\nk" + k);

    }
}

public class override {
    public static void main(String[] args) {
        B subObj = new B(10, 20, 30);
        subObj.display();

    }
}