package figures;

public class Square extends Rectangle {
    // Длина стороны квадрата

    public Square(double a) {
        super(a,a);
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
