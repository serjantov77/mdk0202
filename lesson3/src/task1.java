import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {

        ArrayList<Integer> s = new ArrayList<>();
        s.add(120);
        s.add(75);
        s.add(42);
        s.add(60);
        s.add(110);
        s.add(20);

        int summ = 0;

        for (int x : s) {
            summ += x;
        }

        int srednee = summ / s.size();

        System.out.println("средняя скорость равна " + srednee + " км/ч");
    }
}
