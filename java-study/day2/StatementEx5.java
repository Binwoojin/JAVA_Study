public class StatementEx5 {
    public static void main(String[] args) {
        int third = 0;

        for(int i = 1; i<20; i++) {
            third = 3*i;
            System.out.println("3 x " + i + " = " + third);
        }

        System.out.println("-------------------------");

        for(int j=19; j<0; j--) {
            System.out.println("3 x " + j + " = " + (3*j));
        }
    }
}
