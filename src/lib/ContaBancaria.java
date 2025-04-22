package lib;

public class ContaBancaria {
    String numeroConta;
    double saldo;

    public  ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public  void sacar(double valor){
        if (this.saldo -  valor > 0){
            this.saldo -= valor;
            System.out.println("valor sacado");
            return;
        }
        System.out.println("saldo insufeciantnt");


    }

}
