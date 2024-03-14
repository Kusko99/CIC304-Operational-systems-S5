import java.util.Random;

public class Client extends Thread{
    private String name;
    private Account account;
    private Buffer buffer;

    public Client(String name, Account account, int startBalance, Buffer buffer) {
        this.buffer = buffer;
        this.name = name;
        this.account = account;
    }

    @Override
    public void run(){
        try{
            while (true) {
                Semaphores.depositSemaphore.acquire();
                Semaphores.mutex.acquire();

                execute();

                Semaphores.mutex.release();
                Semaphores.withdrawSemaphore.release();
                Thread.sleep(50);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    
    public void execute() {
        Random random = new Random();
        int value = random.nextInt(1);
        if(value == 0){
            account.deposit(value);
        } else {
            account.withdraw(value);
        }
    }
}

















