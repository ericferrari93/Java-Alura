package bytebankEncapsulado;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 4545);
        conta.setNumero(-330);
        conta.setAgencia(-150);

        Conta conta2 = new Conta(1337, 4549);
        Conta conta3 = new Conta(1337, 4555);

        System.out.println(Conta.getTotal());

    }
}
