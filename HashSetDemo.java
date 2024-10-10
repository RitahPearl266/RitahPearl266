import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate element
        set.add("Orange");

        // Display the elements (duplicates will not be added)
        System.out.println("HashSet contains:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
