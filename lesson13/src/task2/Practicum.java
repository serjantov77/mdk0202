package task2;

import java.util.HashMap;
import java.util.Map;

public class Practicum {
    public static void main(String[] args) {
        Map<String, Boolean> todos = new HashMap<>();

        todos.put("Выучить Java", true);
        todos.put("Найти классную работу", false);

        System.out.println("Todo-список пуст? Ответ: " + todos.isEmpty());

        todos.clear();

        System.out.println("Todo-список пуст? Ответ: " + todos.isEmpty());
    }
}