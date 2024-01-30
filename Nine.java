public class Nine {
        public static void main(String[] args) {
            int[] sourceArray = {1, 2, 3, 4, 5};

            int[] destinationArray = new int[sourceArray.length];

            // Copying elements from the source array to the destination array
            int index = 0;
            for (int element : sourceArray) {
                destinationArray[index] = element;
                index++;
            }
            System.out.print("Destination Array: ");
            for (int element : destinationArray) {
                System.out.print(element + " ");
            }
        }
    }


