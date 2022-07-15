package Introdução.br.com.bytebank.bytebankBanco.Teste;

import Introdução.br.com.bytebank.bytebankBanco.Modelo.ContaCorrente;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.ContaPoupanca;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.SaldoInsfucienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsfucienteException {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);

        cc.transfere(10.0, cp);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupanca: " + cp.getSaldo());



    }
}
