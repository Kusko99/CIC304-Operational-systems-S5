public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        System.out.println(a1);
        Client c1 = new Client("Daniel", a1);
        System.out.println(c1);
        c1.start();
    }
}