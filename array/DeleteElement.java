package array;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Number to delete
        System.out.print("Enter number to delete: ");
        int numToDelete = input.nextInt();

        // Count occurrences
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == numToDelete) {
                count++;
            }
        }

        // If not found
        if (count == 0) {
            System.out.println("Number not found. Original array:");
            printArray(arr);
            return;
        }

        // Create new array
        int[] newArr = new int[n - count];

        // Copy elements except the one to delete
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != numToDelete) {
                newArr[j] = arr[i];
                j++;
            }
        }

        // Display result
        System.out.println("Array after deletion:");
        printArray(newArr);

        input.close();
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}