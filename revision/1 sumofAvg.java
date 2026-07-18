import java.util.Scanner;

class 1 sumofAvg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int arr[]={10,20,30,40};
            int sum =0;
            int avg = 0;
            for(int i=0;i<arr.length;i++){
            
                sum += arr[i];
                System.out.println(sum);
            }
            
            avg = (sum/arr.length);
       
            System.out.println("The sum of the array is: "+sum);
            System.out.println("The average of the array is: "+avg);
        
        sc.close();
    }
}