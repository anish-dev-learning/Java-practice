package array;

import java.util.Scanner;
import java.util.Arrays;

public class sorting {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to sorting of a array: ");
    System.out.println("Enter the size of array: ");
    int size = input.nextInt();
    int[] arr = new int[size];
    int i =0;
    while(i<arr.length){
        System.out.print("Enter the element at position " + (i+1) + " : ");
        arr[i] = input.nextInt();
        i++;
    }
    System.out.println(Arrays.toString(arr));

    boolean isincreasing = isIncreasing(arr);
    boolean isdecreasing = isDecreasing(arr);
    if(isincreasing || isdecreasing){
        System.out.println("The array is sorted array. ");
    }else{
    System.out.println("The array is not a sorted array. ");
    }
    input.close();
}    

public static boolean isDecreasing(int[] arr){
     int i=0;
    while(i < arr.length - 1){
        if(arr[i] > arr[i+1]){
            return false;
        }
        i++;
    }
    return true;
}

public static boolean isIncreasing(int[] arr){
    int i=0;
    while(i < arr.length - 1){
        if(arr[i] < arr[i+1]){
            return false;
        }
        i++;
    }
    return true;
}

}
