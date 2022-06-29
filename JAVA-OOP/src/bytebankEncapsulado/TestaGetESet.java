package bytebankEncapsulado;


public class TestaGetESet {
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 4448);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente eric = new Cliente();
        eric.setNome("Eric Ramos");
        conta.setTitular(eric);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");

    }
}
