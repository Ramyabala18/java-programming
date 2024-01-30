import java.io.*;
import java.util.Scanner;
    public class Eight {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the size of array : ");
            int n = scanner.nextInt();

            int arr[] = new int[n];

            System.out.println("Enter the elements of array : ");
            for(int i=0;i<n;i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Entered elements are : ");
            for(int i=0;i<n;i++) {
                System.out.print(arr[i]+" ");
            }

            int maxVal=0, count=0, maxCount=0;

            for(int i=0;i<n;i++) {
                count = 0;
                for(int j=0;j<n;j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxVal = arr[i];
                }
            }

            System.out.println("\nThe mode is : "+maxVal+" as count is : "+maxCount);
        }
    }
