package model;

public class ContaBancaria {
    private String cliente;
    private int num_conta;
    protected float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public float getSaldo() {
        return saldo;
    }
}