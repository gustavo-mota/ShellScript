public class Transferencia extends Thread{
    ContaBancaria contaOrigem;
    ContaBancaria contaDestino;
    int valorTransferir;

    public Transferencia(ContaBancaria contaOrigem, int valorTransferir, ContaBancaria contaDestino){
        this.valorTransferir = valorTransferir;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public synchronized void run(){
        if (this.contaOrigem.getSaldo() >= this.valorTransferir) {

            this.contaDestino.setSaldo(this.valorTransferir);
            this.contaOrigem.getQuantia(this.valorTransferir);
            System.out.println("Transferencia da conta "+ this.contaOrigem.nome + " para conta " + this.contaDestino.nome + " efetuada");
            System.out.println("Valor Tranferido: "+ this.valorTransferir +"\n");
        }else{
            System.out.println("Saldo insulficiente para transferencia na conta "+ this.contaOrigem.nome+"\n");
        }
    }
}
