
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number you want to count the number of digits: ");
    int n = sc.nextInt();
    int count = 0;
    while(n!=0){
        n/=10;
        count++;
    }        
    System.out.println(count);
    sc.close();    
}
}
