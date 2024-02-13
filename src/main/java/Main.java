import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();

        System.out.println(service.calcMonth(10_000, 3000, 20_000));
        System.out.println(service.calcMonth(100_000, 60_000, 150_000));

    }
}
