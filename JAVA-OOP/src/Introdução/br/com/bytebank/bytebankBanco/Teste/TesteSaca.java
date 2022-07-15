package Introdução.br.com.bytebank.bytebankBanco.Teste;

import Introdução.br.com.bytebank.bytebankBanco.Modelo.Conta;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.ContaCorrente;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.SaldoInsfucienteException;

public class TesteSaca {
    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200);

        try {
            conta.saca(210);
        }catch(SaldoInsfucienteException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}
