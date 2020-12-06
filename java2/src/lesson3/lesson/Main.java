package lesson3.lesson;

import java.text.MessageFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        testArrayList();

//        testLinkedList();

//        testHashMap();

//        testSet();
    }

    private static void testArrayList() {
        ArrayList<ArrayList> lists = new ArrayList<>();


        ArrayList<String> arrayList = new ArrayList<>();

        lists.add(arrayList);

        
        arrayList.add("A");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("B");
        arrayList.add(0, "B");
        arrayList.add("C");

//        ArrayList<String> arrayList2 = new ArrayList<>(2);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(0, "B");
//        System.out.println(arrayList);

//        String[] str = (String[]) arrayList.toArray();

/*        for (String s : arrayList) {
            System.out.println(s);
        }*/

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        System.out.println(Arrays.toString(str));


//        arrayList.remove("B");

        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println(arrayList.contains("A"));
        System.out.println(arrayList.contains("Z"));
    }

    private static void testLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("F");
        linkedList.add("U");
        linkedList.add("B");
        linkedList.add("B");
//        linkedList.add("A");
        linkedList.add("C");
        linkedList.addFirst("A");
        linkedList.addLast("Z");
        linkedList.add(1, "B");

        Collections.sort(linkedList);
        System.out.println(linkedList);

//        System.out.println(linkedList.get(11));

        linkedList.set(1, "O");

        System.out.println(linkedList);
    }
    private static void testSet() {
        Set<String> set = new LinkedHashSet<>();

        set.add("A");
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("D");
        set.add("E");
        set.add("E");

        set.remove("A");

        System.out.println(set);
    }

    private static void testHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Russia", "Moscow");
        map.put("Russia", "Ufa");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Norway", "Oslo");

        List<String> keys = new ArrayList<>(map.keySet());

//        System.out.println(map);

        System.out.println(map.get("Norway"));

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(MessageFormat.format("Страна: {0}, столица: {1}", entry.getKey(), entry.getValue()));
        }

    }



}
