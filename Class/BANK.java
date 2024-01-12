package Class;

class BankAccount {
    String accountNumber;

    String owner;

    double balance;

    void deposit(double a){
        balance += a;
        System.out.println("입금완료"+a+"원");
    }

    void withdraw(double a){
        if(balance < a){
            System.out.println("잔액 부족");
        }
        else{
            balance -= a;
        }
    }

    double getBalance(){
        return balance;
    }



}

public class BANK {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.accountNumber = "123-456-789";

        myAccount.owner = "이종휘";

        myAccount.balance = 1000.0;

        myAccount.deposit(50000);

        myAccount.withdraw(30000);

        double s = myAccount.getBalance();
        System.out.println(s);

    }

}
