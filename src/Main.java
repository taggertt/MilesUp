public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000; // Цена на билеты
        int miles = service.calculate(price); // Расчёт бонусных милей
        System.out.println(miles);
    }
}