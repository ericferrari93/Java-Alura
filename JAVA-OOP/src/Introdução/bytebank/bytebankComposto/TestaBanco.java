package Introdução.bytebank.bytebankComposto;

import Introdução.bytebank.Conta;

public class TestaBanco {
    public static void main(String[] args) {

        Cliente eric = new Cliente();
        eric.nome = "Eric Ramos";
        eric.cpf = "222.222.222-22";
        eric.profissao = "Desenvolvedor";

        Conta contaDoEric = new Conta();
        contaDoEric.deposita(100);

        contaDoEric.titular = eric;
        System.out.println(contaDoEric.titular.nome);
    }
}
