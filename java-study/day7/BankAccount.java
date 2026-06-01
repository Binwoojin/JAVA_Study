public class BankAccount {
    String owner; // 예금주
    int balance;  // 초기 잔액

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        
    }

    public void deposit(int money) {
        balance += money;
        System.out.println(money + "원이 입금되었습니다.");
    }

    public void withdraw(int money) {
        if (balance < money) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= money;
            System.out.println(money + "원이 출금되었습니다.");
        }
    } 
    

    public void printBalace() {
        System.out.println("현재 잔액 : " + balance + "원");
    }
}
