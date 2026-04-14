package feira;

public class Fruta {
    String nome;
    double peso;
    double valor;

    public Fruta(double peso, double valor, String nome) {
        this.peso = peso;
        this.valor = valor;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public void estragar(){
        System.out.println("O " + nome + " estragou");
    }

    public void comer(){
        System.out.println("O cliente acabou de comer o " + nome + " que ele comprou");
    }

    public void madurar(){
        System.out.println("O" + nome + " ainda nao esta maduro");
    }
}
