package array;
import java.util.Scanner;

public class YesUtility {
    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the value in position " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        input.close();
        return arr;
    }

    public static void displayArray(int[] arr){
        int i=0;
        while (i<arr.length) {
            System.out.print(numArray[i]+ " ");
            i++;
        }
        System.out.println();
    }
}