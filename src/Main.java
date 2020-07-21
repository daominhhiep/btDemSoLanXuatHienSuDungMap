import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String string = scanner.nextLine();
        String[] arr = string.split(" ");

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
        for (Map.Entry<String, Integer> entry : treeMap.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}