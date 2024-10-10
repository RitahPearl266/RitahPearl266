import java.util.ArrayList;

public class StoreAndDisplay {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display elements of the ArrayList
        System.out.println("Stored numbers:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
