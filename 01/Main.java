
public class Main {
    public static void  main(String [] args){
        System.out.println("Hello wolrd");

        Crescente thread1 = new Crescente("thread1");
        Crescente thread2 = new Crescente("thread2");
        Thread thread3 = new Thread(new Decrescente("thread3"));
        Thread thread4 = new Thread(new Decrescente("thread4"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
