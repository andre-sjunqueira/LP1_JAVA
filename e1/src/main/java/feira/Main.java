package feira;

public class Main {

    static void main(String[] args) {
        Fruta f = new Fruta(180,5,"limao");

        System.out.println();

        f.estragar();
        f.comer();
        f.madurar();

        System.out.println();


        Cliente c1 = new Cliente(1234567892, "Max Verstappen ", 33 );
        c1.comprar();
        c1.andar();
        c1.reclamar();

        System.out.println();

        Funcionario f1 = new Funcionario(123456789,"Ayrton Senna", 1.70);
        f1.vende();
        f1.come();
        f1.tiraduvida();
    }

}


