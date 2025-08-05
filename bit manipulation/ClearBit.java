public class ClearBit {
    public static void main(String[] args) {
        int pos = 2;
        int bitMask = 1 << pos;
        int n = 5;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);

    }
}
