import java.util.Random;

public class Client extends Thread{
    private Account account;

    public Client(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run(){
        System.out.println("Ta rodando");
        try{
            while (true) {
                System.out.println("passo 1 ok");
                Semaphores.full.acquire();
                System.out.println("passo 2 ok");
                Semaphores.mutex.acquire();
                System.out.println("passo 3 ok");

                execute();
                System.out.println("passo 4 ok");

                Semaphores.mutex.release();
                System.out.println("passo 5 ok");
                Semaphores.empty.release();
                System.out.println("passo 6 ok");
                Thread.sleep(50);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void execute() {
        System.out.println("Ta executando");
        Random random = new Random();
        if (account.getBalance() > 0){
            int value = random.nextInt(2);
            if(value == 0){
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