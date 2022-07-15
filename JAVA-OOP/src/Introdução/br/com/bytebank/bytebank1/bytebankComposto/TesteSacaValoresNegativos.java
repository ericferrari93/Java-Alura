package Introdução.br.com.bytebank.bytebank1.bytebankComposto;

import Introdução.br.com.bytebank.bytebank1.Conta;

public class TesteSacaValoresNegativos {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(200));
        System.out.println(conta.getSaldo());

    }
}
