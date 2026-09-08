import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> zveri = new ArrayList<>();
        zveri.add("Шиншилла");
        zveri.add("Крокодил");
        zveri.add("Лев");
        zveri.add("Медведь");
        zveri.add("Слон");

        System.out.println("сегодня в зоопарке можно увидеть кормления " + zveri.size() + " животных.");
        System.out.println("это будут:");

        for (String z : zveri) {
            System.out.println(z);
        }

        System.out.println("расписание кормлений:");
        System.out.println("в 9:00 - " + zveri.get(1));
        System.out.println("в 10:00 - " + zveri.get(4));
        System.out.println("в 11:00 - " + zveri.get(0));
        System.out.println("в 12:00 - " + zveri.get(2));
        System.out.println("в 13:00 - " + zveri.get(3));
    }
}
