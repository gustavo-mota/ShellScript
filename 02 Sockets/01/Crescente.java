public class Crescente extends Thread{
    String nome;

    public Crescente(String nome){
        this.nome = nome;
    }

    public void run(){
         for(int i=0; i<=100; i++){
             System.out.println(nome + " " + i);
         }
    }
}
