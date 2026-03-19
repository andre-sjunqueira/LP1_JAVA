
public class Main {
  public static void main(String[] args){
    Remedio r1 = new Remedio("dipirona",20,50);
    System.out.println();
    r1.matar();
    r1.curar();
    r1.estragar();

    System.out.println();

    Cliente c1 = new Cliente(1234567892, "Carlos alberto", 29 );
    c1.comprar();
    c1.andar();
    c1.reclamar();

    System.out.println();


    Funcionario f1 = new Funcionario(123456789,"Neymar", 1.70);
    f1.vende();
    f1.come();
    f1.tiraduvida();
    }



}