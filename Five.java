public class Five {
    public static void main(String[] args) {
        // Source array
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Destination array with the same length as the source array
        int[] destinationArray = new int[sourceArray.length];

        // Copy elements from sourceArray to destinationArray using enhanced for loop
        int index = 0;
        for (int element : sourceArray) {
            destinationArray[index++] = element;
        }

        // Display the contents of both arrays
        System.out.println("Source Array:");
        printArray(sourceArray);

        System.out.println("\nDestination Array (copied using enhanced for loop):");
        printArray(destinationArray);
    }

    // Helper method to print the contents of an array
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
