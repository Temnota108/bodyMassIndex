public class BmiService {
    public double calculate(double weight, double height) {
        double result;
        if (height > 0) {
            result = weight / height / height;
        } else {
            result = 0;
        }
        return result;
    }
}
