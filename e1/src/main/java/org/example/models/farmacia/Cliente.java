package org.example.models.farmacia;

public class Cliente {
    int cpf;
    String nome;
    int idade;

    public Cliente(int cpf, String nome, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void comprar(){
        System.out.println("O Cliente "+ nome + " acabou de comprar o remedio");
    }

    public void reclamar(){
        System.out.println("O Cliente "+ nome + " acabou de reclamar do preço do remedio");
    }

    public void andar(){
        System.out.println("O Cliente "+ nome + " virou as costas e andou ate a saida da loja");
    }
}
