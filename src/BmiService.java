public class BmiService {
    public double calculate(double weight, double growth) {
        double m = weight;
        double h = growth;
        double results = m / h;

        return results;
    }
}
