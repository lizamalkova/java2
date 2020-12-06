package lesson3.homework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Task1 {

    private static final String[] INPUT_DATA = {
            "a",
            "b", "b", "b",
            "c",
            "d",
            "e", "e",
            "f",
            "g", "g", "g",
            "h",
            "g",
            "i"
    };


    public static void main(String[] args) {
        Map<String, Integer> frequencyByWord = new HashMap<>();

        for (String word : INPUT_DATA) {
//            Integer frequency = frequencyByWord.get(word);
//            if (frequency == null) {
//                frequency = 0;
//            }
            Integer frequency = frequencyByWord.getOrDefault(word, 0);
            frequencyByWord.put(word, ++frequency);

        }

/*        for (Map.Entry<String, Integer> entry : frequencyByWord.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/

/*        for (String word : frequencyByWord.keySet()) {
            Integer frequency = frequencyByWord.get(word);
            System.out.println(word + " : " + frequency);
        }*/

        frequencyByWord.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String word, Integer frequency) {
                System.out.println(word + " : " + frequency);
            }
        });

    }
}
