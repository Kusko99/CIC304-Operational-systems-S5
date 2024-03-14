import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    // Capacidade do buffer
    private int capacity;
    // Fila de inteiros
    private final Queue<Integer> queue = new LinkedList<>();

    // Construtor
    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    // Armazena um número na fila
    public void put(Integer number) {
        if (queue.size() < capacity) {
            // Adiciona um número na fila
            boolean isAdded = queue.offer(number);
            if (isAdded) {
                System.out.printf("%s adicionou %d na fila%n",
                        Thread.currentThread().getName(), number);
            }
        }
    }

    // Obter a capacidade
    public int getCapacity() {
        return this.capacity;
    }

    // Remove um número da fila
    public void get() {
        if (queue.size() > 0) {
            // Remove um número da fila
            Integer value = queue.poll();
            if (value != null) {
                System.out.printf("%s removeu %d da fila%n",
                        Thread.currentThread().getName(), value);
            }
        }
    }
}
