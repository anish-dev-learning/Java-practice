package pattern;


public class rectangle {
    public static void main(String[] args) {
        int row = 3;
        int col = 5;

        //outer loop for rows
        for(int i=0;i<row;i++){
            //inner loop for columns
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}