package array;

public class palindromArray {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrom Array: ");
        int[] numArr =YesUtility.createArray();
        boolean isPalin = isPlaindrome(numArr);
        if(isPalin){
            System.out.println("Your array is Palindrome.");
        }else{
            System.out.println("Your array is not Palindrome.");
        }
    }

    public static boolean isPlaindrome(int[] numArr){
        int i=0;
        while(i<numArr.length /2){
            if(numArr[i] != numArr[numArr.length -1 -i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
