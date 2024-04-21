package model;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (saldo - valor >= -limite) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}