import java.util.concurrent.Semaphore;

public class Semaphores{

    public static Semaphore mutex = new Semaphore(1);

    public static Semaphore depositSemaphore = new Semaphore(0);
    
    public static Semaphore withdrawSemaphore = new Semaphore(0);
    
}