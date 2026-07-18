package array;
import java.util.Scanner;

public class YesUtility {
    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new intsize[];
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
            System.out.print(arr[i]+ " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns: : ");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];
        int i=0;
        while(i< rows){
            int j=0;
            while(j< columns){
                System.out.print("Please enter teh element row: " + ", column: " + (j+1) + " : ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        input.close();
        return numArray;
    
}
}