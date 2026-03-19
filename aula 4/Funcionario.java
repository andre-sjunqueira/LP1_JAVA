public class Funcionario {

    int CTPS;
    String nome;
    double altura;

    public Funcionario(int CTPS, String nome, double altura) {
        this.CTPS = CTPS;
        this.nome = nome;
        this.altura = altura;
    }

    public int getCTPS() {
        return CTPS;
    }

    public void setCTPS(int CTPS) {
        this.CTPS = CTPS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void vende() {
        System.out.println("O vendedor " + nome + " acabou de vender.");
    }

    public void tiraduvida() {
        System.out.println("O vendedor " + nome + " tirou a duvida de um cliente");
    }

    public void come() {
        System.out.println("O vendedor " + nome + " saiu para almoçar.");
    }


}
