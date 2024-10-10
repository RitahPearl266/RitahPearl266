import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);

        // Access and display a value from the HashMap using a key
        System.out.println("Value for key 'Banana': " + map.get("Banana"));

        // Display all key-value pairs
        System.out.println("All key-value pairs in HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + " ->" + map.get(key));
        }
    }
}
