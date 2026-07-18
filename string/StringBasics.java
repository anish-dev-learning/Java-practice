package string;
// Strings in java are immutable
public class StringBasics{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Character at index 0
        System.out.println(sb.charAt(0));

        // Set character at index
        sb.setCharAt(0,'P');
        System.out.println(sb);
        
        //insert character at index
        sb.insert(0,'S');
        sb.insert(2,'n');
        System.out.println(sb);
        
        // delete character in string
        sb.delete(2,4);
        System.out.println(sb);

        //Append
        sb.append("e");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
