public class Saque extends Thread {
    ContaBancaria conta;
    int valorSacar;

    public Saque(ContaBancaria conta, int valorSacar){
        this.valorSacar = valorSacar;
        this.conta = conta;
    }
    public synchronized void run (){
        if (this.conta.getSaldo() >= this.valorSacar) {
            this.conta.getQuantia(valorSacar);
            System.out.println("Saque na conta "+this.conta.nome+" valor: "+this.valorSacar+"\n");

        }else{
            System.out.println("Saldo insulficiente na conta " + this.conta.nome+"\n");
        }
    }
}
