import java.util.Scanner;

public class trianglealpha {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");        
    int rows = sc.nextInt();

    for(int i=0;i<rows;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)(j+65));
        }
        System.out.println();
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)(i+65));
        }
        System.out.println();
    }


}
}
