import java.io.*;
import java.util.Scanner;
    public class Seve {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the size of array : ");
            int n = scanner.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the elements in sorted array : ");
            for(int i=0;i<n;i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Entered elements are : ");
            for(int i=0;i<n;i++) {
                System.out.print(arr[i]+" ");
            }

            int median;
            if(n%2 == 0) {
                int first = arr[(n/2) - 1];
                int second = arr[n/2];
                median = (first+second)/2;
                System.out.println("\nThe median is  : "+median);
            }


            //If number of elements of array odd then median will be middle element

            if(n%2 != 0) {
                median = arr[(n-1)/2];
                System.out.println("\nThe median is  : "+median);
            }
        }
}
