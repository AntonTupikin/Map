import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isWhitespace;


public class Main {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        int stringLength = string.length();
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (i < stringLength) {
            if (map.containsKey(string.charAt(i)) & Character.isLetter(string.charAt(i))) {
                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
            } else {
                map.put(string.charAt(i), 1);
            }
            i++;
        }
        max(map);
        min(map);


    }

    public static void max(Map<Character, Integer> map) {
        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        String MaxValue;
        if (isWhitespace(maxEntry.getKey())) {
            MaxValue = "Пробел";
        } else {
            MaxValue = String.valueOf(maxEntry.getKey());
        }
        System.out.println("Самый часто повторяющийся символ: \n" + MaxValue + " - " + maxEntry.getValue() + " раз");
    }

    public static void min(Map<Character, Integer> map) {
        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() < maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        String MaxValue;
        if (isWhitespace(maxEntry.getKey())) {
            MaxValue = "Пробел";
        } else {
            MaxValue = String.valueOf(maxEntry.getKey());
        }
        System.out.println("Самый редко повторяющийся символ: \n" + MaxValue + " - " + maxEntry.getValue() + " раз");
    }

}