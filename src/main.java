public class main {
   public static void main (String[] args) {

       int price; // Стоимость билетов
       int bonusPrice; // Рублей необходимо для начисления одной мили

       price = 100;
       bonusPrice = 20;

       if (price >= bonusPrice) {
           int miles = price / bonusPrice; // Количество бонуснух милей
           System.out.println("Начислено бонусных милей - " + miles);
       } else {
           System.out.println("Бонусные мили не начислены!");
       }
   }
}