public class OperEx5 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 22; // 0001 0110

        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));

        byte c = 13; // 0000 1101
        byte d = 22; // 0001 0110

        // c & d : 0000 0100 - 4
        // c | d : 0001 1111 - 31

        System.out.println("c & d : " + (c&d));
        System.out.println("c | d : " + (c|d));
    }
    
}
