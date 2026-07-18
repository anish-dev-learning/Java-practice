// a a a a
// B B B B 
// c c c c
// D D D D


public class mixAlpha {
    public static void main(String[] args) {
        int row = 4;
        //rows
       for(int i = 0 ; i < row ; i++){
        //column    
        for(int j=0;j<row;j++){
            if(i%2 == 0) {
                System.out.print((char)(i+ 97));
            }else{
                 System.out.print((char)(i+ 65));
            }
        }
       System.out.println();
    }
    }
}
