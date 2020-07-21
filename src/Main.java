import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String[] arr = inputString();
        Map<String, Integer> treeMap = checkKeyInMap(arr);
        display(treeMap);
    }

    private static void display(Map<String, Integer> treeMap) {
        for (Map.Entry<String, Integer> entry : treeMap.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    private static Map<String, Integer> checkKeyInMap(String[] arr) {
        Map<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
            if (treeMap.containsKey(arr[i])) {
                int newValue = treeMap.get(arr[i]) + 1;
                treeMap.replace(arr[i], newValue);
            } else {
                treeMap.put(arr[i], 1);
            }
        }
        return treeMap;
    }

    private static String[] inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String string = scanner.nextLine();
        return string.split(" ");
    }
}