import java.util.Random;

public class Client extends Thread{
    private Account account;

    public Client(String name, Account account) {
        super(name);
        this.account = account;
    }
    
    @Override
    public void run(){
        
        try{
            while (true) {

                Semaphores.mutex.acquire();
                execute();
                Semaphores.mutex.release();

                Thread.sleep(500);
            
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        
    }

    public void execute() {
        Random random = new Random();
            int option = random.nextInt(2);

        if (account.getBalance() > 0){
            if(option == 0){
                account.deposit();
            } else {
                account.withdraw();
            }
        }
        else {
            account.deposit();
        }
    }
}