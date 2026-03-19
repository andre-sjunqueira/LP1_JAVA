# 📚 Exercícios de Java


### 6.1 Abstração
Escolher dois pontos de comércio (loja de sapato, feira livre, farmácia, concessionária de carro ou moto, loja de roupas, etc), verificar os objetos vendidos e realizar a abstração deles

1 - feira 

```java
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

```
<br>

### 6.2 Abstração
Escolher dois pontos de comércio (loja de sapato, feira livre, farmácia, concessionária de carro ou moto, loja de roupas, etc), verificar os objetos vendidos e realizar a abstração deles

2 - utilidade domestica 

```java
public class Secador {
    String marca;
    int voltagem;
    int peso;

    public Secador(String marca, int voltagem, int peso) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void ligar( ){
        System.out.println("O funcionario ligou o secador");
    }

    public void desligar(){
        System.out.println("O funcionario desligou o secador ");
    }

    public void queimar(){
        System.out.println("O secador acabou de queimar");
    }
}

```












