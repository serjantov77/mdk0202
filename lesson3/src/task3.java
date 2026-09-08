import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        ArrayList<String> sps = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        sps.add("Шиншилла");
        sps.add("Крокодил");
        sps.add("Лев");

        while (true) {
            System.out.println("\n--- меню ---");
            System.out.println("1. показать список");
            System.out.println("2. добавить");
            System.out.println("3. удалить");
            System.out.println("4. очистить");
            System.out.println("5. проверить");
            System.out.println("0. выход");
            System.out.print("выберите команду: ");

            int cmd = sc.nextInt();
            sc.nextLine();

            if (cmd == 0) {
                System.out.println("программа завершена.");
                break;
            }

            switch (cmd) {
                case 1:
                    if (sps.size() == 0) {
                        System.out.println("в зоопарке пока нет животных.");
                    } else {
                        System.out.println("сейчас в зоопарке живут:");
                        for (String a : sps) {
                            System.out.println("- " + a);
                        }
                    }
                    break;

                case 2:
                    System.out.print("введите название животного для добавления: ");
                    String n = sc.nextLine();
                    sps.add(n);
                    System.out.println(n + " успешно добавлен(а) в список.");
                    break;

                case 3:
                    if (!sps.isEmpty()) {
                        System.out.print("введите название животного для удаления: ");
                        String r = sc.nextLine();
                        if (sps.remove(r)) {
                            System.out.println(r + " удален(а) из списка.");
                        } else {
                            System.out.println("такого животного не было в списке.");
                        }
                    } else {
                        System.out.println("ошибка: список животных пуст, нечего удалять!");
                    }
                    break;

                case 4:
                    if (sps.isEmpty()) {
                        System.out.println("список и так пуст, очистка не требуется.");
                    } else {
                        sps.clear();
                        System.out.println("список животных успешно очищен.");
                    }
                    break;

                case 5:
                    System.out.print("какое животное вы хотите проверить? ");
                    String ch = sc.nextLine();
                    if (sps.contains(ch)) {
                        System.out.println("да, " + ch + " есть в нашем зоопарке.");
                    } else {
                        System.out.println("нет, " + ch + " у нас не живет.");
                    }
                    break;

                default:
                    System.out.println("неизвестная команда. попробуйте еще раз.");
            }
        }
    }
}
