package org.example.models.farmacia;

public class Remedio {
    private String nome;
    private double preco;
    private double validade;

    public Remedio(String nome, double preco, double validade){
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValidade() {
        return validade;
    }

    public void setValidade(double validade) {
        this.validade = validade;
    }

    public void curar() {
        System.out.println("O remédio " + nome + " está curando o paciente.");
    }

    public void matar() {
        System.out.println("Dose errada! O remédio " + nome + " pode matar.");
    }

    public void estragar() {
        System.out.println("O remédio " + nome + " estragou porque passou da validade.");
    }
}
