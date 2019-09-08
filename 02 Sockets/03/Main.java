public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("01", 100);
        ContaBancaria conta2 = new ContaBancaria("02", 200);
        ContaBancaria conta3 = new ContaBancaria("03", 30);

        Deposito deposito1 = new Deposito(conta1, 100);
        Deposito deposito2 = new Deposito(conta2, 200);
        Deposito deposito3 = new Deposito(conta3, 50);

        Transferencia transferencia1 = new Transferencia(conta1, 200, conta2);
        Transferencia transferencia2 = new Transferencia(conta1, 20, conta3);

        Transferencia transferencia3 = new Transferencia(conta2, 10, conta1);
        Transferencia transferencia4 = new Transferencia(conta2, 50, conta3);

        Transferencia transferencia5 = new Transferencia(conta3, 90, conta1);
        Transferencia transferencia6 = new Transferencia(conta3, 60, conta2);

        Saque saque1 = new Saque(conta3, 400);
        Saque saque2 = new Saque(conta2, 50);
        Saque saque3 = new Saque(conta1, 70);

        deposito1.start();
        transferencia1.start();
        deposito2.start();
        transferencia5.start();
        deposito3.start();
        saque1.start();
        transferencia3.start();
        saque3.start();
        transferencia4.start();
        transferencia2.start();
        saque2.start();
        transferencia6.start();
    }
}
