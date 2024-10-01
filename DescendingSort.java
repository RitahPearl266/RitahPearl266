import java.util.Arrays;
import java.util.Collections;
public class DescendingSort {

    public static void main(String[] args) {
        Integer[] numbers = {42, 15, 8, 23, 4};
        // Sorting the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        //Printing the sorted array
        System.out.println("Number in descending order:" + Arrays.toString(numbers));
    }
}