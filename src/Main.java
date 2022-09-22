public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75.5; // введите Ваш вес в килограммах
        double height = 1.80; // введите Ваш рост в метрах
        double bmi = service.calculate (weight, height);
        System.out.println("Ваш индекс массы тела составляет: ");
        System.out.println(bmi);
    }
}

