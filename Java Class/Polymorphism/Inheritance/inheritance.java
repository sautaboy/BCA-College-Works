class Shape {
    int l;
    int b;
    int r;

    public void area(int r) {
        System.out.println("The area of a circle is " + r * r);
    }
}

class Traingle extends Shape {
    public void area() {
        System.out.println("The area of a triangle is " + r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.l = 2;
        shape.b = 3;
        shape.r = 4;
        shape.area(shape.r);
        Traingle t = new Traingle();
        t.area();
    }

}