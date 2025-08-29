package ex04;

public class Cliente {
    private String nome;
    private Double saldo;
    private final Double limite; //limite é um valor fixo que o usuário não pode alterar sem intervenção do adm (banco).

    public Cliente(String nome, Double saldo, Double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(Double saque){
        if(saque <= 0)
         throw new IllegalArgumentException("Erro: A quantia para saque deve ser um valor positivo.");

        if(this.checarSaldo() > saque){ 
            this.saldo -= saque;
            System.out.println("Saque de R$"+ saque +" realizado com sucesso");
        }
        else
            System.out.println("Saldo insuficiente para realizar o saque");
    }

    public void depositar(Double deposito){
        if(deposito <= 0)
         throw new IllegalArgumentException("Erro: A quantia para depósito deve ser um valor positivo.");

        this.saldo += deposito;
        System.out.println("Deposito de R$" + deposito + " realizado com sucesso.");
    }

    public Double checarSaldo(){
        return this.saldo + this.limite;
    }

    public String checarNome(){
        return this.nome;
    }

    public Double getSaldo(){
        return this.saldo;
    }
}
