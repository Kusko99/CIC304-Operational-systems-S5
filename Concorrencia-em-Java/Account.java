import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Account {
    private int balance;

    public Account(int startBalance){
        this.balance = startBalance;
    }

    public void deposit(){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(100);
        int value = list.get(random.nextInt(list.size()));
        this.balance += value;
        System.out.printf("%s depositou %d na conta%n",Thread.currentThread().getName(), value);
        System.out.flush();

    }
    
    public void withdraw(){
        if (balance > 0) {
            Random random = new Random();
            List<Integer> list = new ArrayList<>();
            list.add(10);
            if (balance >= 20){
                list.add(20);
                if (balance >= 50) {
                    list.add(50);
                    if (balance >= 100){
                        list.add(100);
                    }
                }
            }
            int value = list.get(random.nextInt(list.size()));
            this.balance -= value;
            System.out.printf("%s sacou %d da conta%n",Thread.currentThread().getName(), value);
            System.out.flush();
        }
    }

    public int getBalance(){
        return this.balance;
    }
    
}