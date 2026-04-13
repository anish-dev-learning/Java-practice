package array;

public class reverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array reversal:  ");
        int []numArr = YesUtility.createArray();
        reverse(numArr);
        System.out.println("Your reversed array is : ");
        YesUtility.displayArray(numArr);
    }

    public static void reverse(int[] arr){
        int i=0;

        while(i<arr.length /2){
        int swap = arr[i];
        arr[i] = arr[(arr.length -1)-i];
        arr[(arr.length - 1) - i] = swap;
        i++;
        }
    }
}
