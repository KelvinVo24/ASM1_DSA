public class Array {
    public static void main(String[] args) {
        int[] array = new int[5]; // Fixed size array
        array[0] = 24;
        array[1] = 59;
        array[2] = 20;
        array[3] = 10;
        array[4] = 550;

        // Access element
        System.out.println("Element at index 2 is: " + array[2]); // O(1)

        // Search element
        int searchElement = 30;
        for (int i = 0; i < array.length; i++) { // O(n)
            if (array[i] == searchElement) {
                System.out.println("Element found at index: " + i);
            }
        }

        // Insertion and Deletion would require creating a new array if fixed size is exceeded or if shifting is required.
    }
}
