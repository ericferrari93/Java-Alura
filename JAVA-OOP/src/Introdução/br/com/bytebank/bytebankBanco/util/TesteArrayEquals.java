package Introdução.br.com.bytebank.bytebankBanco.util;

import Introdução.br.com.bytebank.bytebankBanco.Modelo.Conta;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayEquals {
    public static void main(String[] args) {

//        Conta cc1 = new ContaCorrente(22, 11);
//        Conta cc2 = new ContaCorrente(22, 22);
//
//        boolean igual = cc1.eIgual(cc2);
//        System.out.println(igual);



          ArrayList<Conta> lista = new ArrayList<Conta>();

          Conta cc = new ContaCorrente(22, 11);
          lista.add(cc);

          Conta cc2 = new ContaCorrente(22, 22);
          lista.add(cc2);

          Conta cc3 = new ContaCorrente(22, 22);


          boolean existe = lista.contains(cc3);

          System.out.println("Ja existe ? " + existe);


          for(Conta conta : lista){
              System.out.println(conta);
          }

    }
}
