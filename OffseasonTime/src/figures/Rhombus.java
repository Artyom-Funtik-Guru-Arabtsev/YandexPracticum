package figures;

public class Rhombus extends Parallelogram {
    // Длина стороны ромба

    public Rhombus(double a, double h) {
        super(a,h);
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
