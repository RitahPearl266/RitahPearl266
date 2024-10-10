public class GenericMethodDemo {

    // Generic method to print elements of any type
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create arrays of Integer, Double, and String
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3};
        String[] stringArray = {"Apple", "Banana", "Orange"};

        // Call the generic method with different types of arrays
        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("Double Array:");
        printArray(doubleArray);

        System.out.println("String Array:");
        printArray(stringArray);
    }
}
