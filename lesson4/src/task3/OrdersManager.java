package task3;

import java.util.ArrayList;
import java.util.HashMap;

public class OrdersManager {
    HashMap<String, ArrayList<Double>> customersOrders;

    public OrdersManager() {
        customersOrders = new HashMap<>();
        ArrayList<Double> orders = new ArrayList<>();
        orders.add(154.43);
        orders.add(5453.98);
        orders.add(8776.65);
        customersOrders.put("Иван И.", orders);

        orders = new ArrayList<>();
        orders.add(25343.54);
        orders.add(420.50);
        customersOrders.put("Ольга С.", orders);

        orders = new ArrayList<>();
        orders.add(325.90);
        customersOrders.put("Александр Т.", orders);

        orders = new ArrayList<>();
        orders.add(253.54);
        orders.add(420.50);
        customersOrders.put("Александр Р.", orders);

        orders = new ArrayList<>();
        orders.add(780.54);
        orders.add(420.50);
        orders.add(36343.54);
        orders.add(2000.50);
        customersOrders.put("Екатерина О.", orders);
    }

    void printAllOrders() {

        for (String name : customersOrders.keySet()) {
            System.out.println("заказы " + name + ":");
            ArrayList<Double> value = customersOrders.get(name);
            System.out.println(value);
        }
    }

    double getOrdersSum() {
        double sum = 0;

        for (ArrayList<Double> orders : customersOrders.values()) {
            for (double orderPrice : orders) {
                sum += orderPrice;
            }
        }
        return sum;
    }

    void printCustomerOrders(String customerName) {

        if (customersOrders.containsKey(customerName)) {
            System.out.println("заказы " + customerName + ":");
            System.out.println(customersOrders.get(customerName));
        }
    }

    String getMaxOrderCustomerName() {
        double maxOrder = 0;
        String customerName = "";


        for (String k : customersOrders.keySet()) {
            double s = 0;
            for (double d : customersOrders.get(k)) {
                s += d;
            }
            if (s > maxOrder) {
                maxOrder = s;
                customerName = k;
            }
        }

        return customerName;
    }

    void removeUnprofitableOrders() {

        ArrayList<String> names = new ArrayList<>();


        for (String k : customersOrders.keySet()) {
            double ordersSum = 0;
            for (double d : customersOrders.get(k)) {
                ordersSum += d;
            }

            if (ordersSum < 5000) {
                names.add(k);
            }
        }

        for (String n : names) {
            customersOrders.remove(n);
            System.out.println("клиента " + n + " больше нет в таблице.");
        }
    }
}
