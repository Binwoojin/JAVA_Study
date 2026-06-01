public class TestMainQuiz2 {
    public static void main(String[] args) {
        
        BankAccount bank1 = new BankAccount("홍길동", 100000);
        bank1.printBalace();
        bank1.deposit(50000);
        bank1.printBalace();
        bank1.withdraw(80000);
        bank1.printBalace();
        bank1.withdraw(100000);

    }
}
