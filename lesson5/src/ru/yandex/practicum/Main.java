package ru.yandex.practicum;

import ru.yandex.practicum.work.WorkCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите имя работника:");
        WorkCalculator calculator = new WorkCalculator(scanner.next());

        System.out.println("введите коэффициент в формате 1.5:");
        calculator.coefficient = scanner.nextDouble();

        System.out.println("введите количество отработанных дней без коэффициента:");
        double hoursWithoutCoefficient = calculator.calculate(scanner.nextInt());

        System.out.println("введите количество отработанных дней с коэффициентом:");
        double hoursWithCoefficient = calculator.calculateWithCoefficient(scanner.nextInt());

        double allWorkHours = hoursWithoutCoefficient + hoursWithCoefficient;

        System.out.printf("работник %s отработал %.2f часов.",
                calculator.getWorkerName(), allWorkHours);
    }
}