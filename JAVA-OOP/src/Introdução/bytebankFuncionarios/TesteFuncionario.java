package Introdução.bytebankFuncionarios;

public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente eric = new Gerente();
        eric.setNome("Eric Ferrari");
        eric.setCpf("222.222.222-22");
        eric.setSalario(2600.00);

        System.out.println(eric.getNome());
        System.out.println(eric.getBonificacao());


    }
}
