package ru.yandex.practicum.booking;

import ru.yandex.practicum.model.BedAndBreakfast;
import java.util.Scanner;

public class BookingService {

    public static void main(String[] args) {
        BedAndBreakfast hotel = new BedAndBreakfast();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("что вы хотите сделать?");
            System.out.println("1 - забронировать номер");
            System.out.println("2 - освободить номер");
            System.out.println("3 - проверить наличие свободных номеров");
            System.out.println("0 — выход");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    hotel.book();
                    break;
                case 2:
                    hotel.free();
                    break;
                case 3:
                    if (hotel.isFull()) {
                        System.out.println("больше нет мест¯\\_(ツ)_/¯");
                    } else {
                        System.out.println("есть свободные номера!");
                    }
                    break;
                case 0:
                    System.out.println("выход");
                    System.exit(0);
                default:
                    System.out.println("извините, такой команды пока нет.");
                    break;
            }
        }
    }
}