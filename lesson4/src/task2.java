import java.util.HashMap;
import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> h = new HashMap<>();


        ArrayList<Integer> m1 = new ArrayList<>();
        m1.add(1);
        m1.add(7);

        ArrayList<Integer> m2 = new ArrayList<>();
        m2.add(23);

        ArrayList<Integer> m3 = new ArrayList<>();
        m3.add(8);

        ArrayList<Integer> m5 = new ArrayList<>();
        m5.add(1);
        m5.add(9);

        ArrayList<Integer> m6 = new ArrayList<>();
        m6.add(12);

        ArrayList<Integer> m11 = new ArrayList<>();
        m11.add(4);


        h.put("Январь", m1);
        h.put("Февраль", m2);
        h.put("Март", m3);
        h.put("Май", m5);
        h.put("Июнь", m6);
        h.put("Ноябрь", m11);

        System.out.println("государственные праздники: " + h);
    }
}
