public class Account {
    private int balance;

    public Account(){
        this.balance = 0;
    }

    public Account(int startBalance){
        this.balance = startBalance;
    }

    public void deposit(int deposit){
        this.balance += deposit;
    }
    
    public void withdraw(int withdraw){
        this.balance -= withdraw;
    }

    public int getBalance(){
        return this.balance;
    }
    
}
    
