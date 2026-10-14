package task2;

import java.util.Scanner;

class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("заполните данные для ипотечной заявки и узнайте статус одобрения");
        System.out.println("введите ФИО:");
        String name = scanner.nextLine();

        System.out.println("ваш возраст:");
        byte age = scanner.nextByte();

        System.out.println("планируемая сумма ипотеки:");
        int mortgageAmount = scanner.nextInt();

        scanner.nextLine();
        System.out.println("трудоустроены ли вы сейчас? (д/н)");
        String employedString = scanner.nextLine();
        boolean employed = employedString.equalsIgnoreCase("д");

        MortgageRequest mortgageRequest = new MortgageRequest(name, age, mortgageAmount, employed);
        mortgageRequest.validate();
    }
}
