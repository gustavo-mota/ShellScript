public class ContaBancaria extends Thread{
    String nome;
    int saldo;

    public ContaBancaria(String nome, int saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void setSaldo(int saldo){
        this.saldo += saldo;
    }

    public void getQuantia(int quantia){

        if(this.saldo >= quantia){
            this.saldo -= quantia;

        }else{
            System.out.println("Saldo insulficiente");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
}
