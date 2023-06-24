//Урок  5. Хранение и обработка данных ч2: множество коллекций Map
//
//        Задание
//        Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
//        их необходимо считать, как одного человека с разными телефонами.
//        Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Task1_HW {
    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<>();
        put(book, "Владимир", "+79814001020");
        put(book, "Мария", "+79214001050");
        put(book, "Владимир", "+79994002090");
        put(book, "Майя", "+79394006099");
        print(book);

    }

    public static void put(HashMap<String, String> book, String contact, String phone) {
        book.merge(contact, phone, (ph1, ph2) -> ph1 + ", " + ph2);
    }

    public static void print(HashMap<String, String> book) {
        ArrayList<Map.Entry<String, String>> list = new ArrayList<>(book.entrySet());
        list.sort((o1, o2) -> o2.getValue().length() - o1.getValue().length());
        for (Map.Entry<String, String> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


