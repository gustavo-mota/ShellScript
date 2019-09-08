public class Decrescente implements Runnable{
    String nome;

    public Decrescente(String nome){
        this.nome = nome;
    }

    public void run(){
        for(int i=100; i>=0; i--){
            System.out.println(nome + " " + i);
        }
    }
}
