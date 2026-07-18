public class alphaLetter {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                char ch=(char)(j+64);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
