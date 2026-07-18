package Bit;

public class Bits {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask = 1<<pos;
        int NotbitMask = ~(bitMask);
        int newNumber = NotbitMask & n;
        // int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
