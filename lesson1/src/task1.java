public class task1 {
    public static void main(String[] args) {
        double rubles = 30002.7;
        double rateUSD = 78.5;

        double dollars = rubles / rateUSD;

        System.out.println("у вас на счету " + rubles + " рублей, в долларах это " + dollars + " долларов.");
    }
}