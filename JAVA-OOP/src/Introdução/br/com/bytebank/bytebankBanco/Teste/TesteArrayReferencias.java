package Introdução.br.com.bytebank.bytebankBanco.Teste;

import Introdução.br.com.bytebank.bytebankBanco.Modelo.Cliente;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.Conta;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.ContaCorrente;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {


        Object[] referencias = new Object[5];

        System.out.println(referencias.length);

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

//        Object referenciaGenerica = referencias[1];
//
//        System.out.println(referenciaGenerica.getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1];// type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());


    }
}
