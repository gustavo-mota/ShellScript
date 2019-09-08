
public class Main{
    public static void  main(String [] args){

      Corredor corredor1 = new Corredor("corredor1", 10, 100);
      Corredor corredor2 = new Corredor("corredor2", 100, 100);
      Corredor corredor3 = new Corredor("corredor3", 50, 100);
      Corredor corredor4 = new Corredor("corredor4", 110, 100);

      corredor1.start();
      corredor2.start();
      corredor3.start();
      corredor4.start();
    }
}
