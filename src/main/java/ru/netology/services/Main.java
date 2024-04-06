import ru.netology.services.RelaxService;

public class Main {
    public static void main(String[] args) {
        RelaxService service = new RelaxService();
        int myCalculate = service.calculate(100_000, 60_000, 150_000);
        System.out.println(myCalculate);
    }
}