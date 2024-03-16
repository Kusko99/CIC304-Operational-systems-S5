import java.util.concurrent.Semaphore;

public class Semaphores {
    public static Semaphore mutex = new Semaphore(1);
    public static Semaphore empty = new Semaphore(1);
    public static Semaphore full = new Semaphore(0);
}
