public class Deposito extends Thread{
    ContaBancaria conta;
    int valorDepositar;

    public Deposito(ContaBancaria conta, int valorDepositar){
        this.valorDepositar = valorDepositar;
        this.conta = conta;
    }

    public synchronized void run(){
        this.conta.setSaldo(this.valorDepositar);
        System.out.println("Depósito na conta "+this.conta.nome +" valor "+this.valorDepositar+"\n");

    }
}
