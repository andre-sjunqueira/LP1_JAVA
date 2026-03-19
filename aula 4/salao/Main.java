public class Main {

    static void main(String[] args) {
        Secador s1 = new Secador( "Philips", 220,700);

        System.out.println();

        s1.ligar();
        s1.desligar();
        s1.queimar();

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