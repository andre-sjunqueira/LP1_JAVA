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
