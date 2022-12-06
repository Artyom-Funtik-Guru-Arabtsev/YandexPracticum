package hot_keys;

public class Ai92Calculator {
    double ai92Price = 42.74;
    double tax = 0.13;
    double fullPrice = ai92Price * (1 + tax);

    public double calculate(double volume) {
        System.out.println("fullPrice = " + fullPrice);
        return volume * fullPrice;
    }
}
