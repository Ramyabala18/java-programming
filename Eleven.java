public class Eleven {
        public static void main(String[] args) {
            // Source array
            int[] sourceArray = {1, 2, 3, 4, 5};

            // Creating a destination array with the same length as the source array
            int[] destinationArray = new int[sourceArray.length];

            // Copying elements from the source array to the destination array
            for (int i = 0; i < sourceArray.length; i++) {
                destinationArray[i] = sourceArray[i];
            }

            // Displaying the elements of both arrays
            System.out.print("Source Array: ");
            displayArray(sourceArray);

            System.out.print("\nDestination Array: ");
            displayArray(destinationArray);
        }

        // Method to display elements of an array
        private static void displayArray(int[] arr) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
        }
    }


