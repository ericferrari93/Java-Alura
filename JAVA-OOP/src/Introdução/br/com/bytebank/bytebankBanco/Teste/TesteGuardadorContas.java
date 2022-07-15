package Introdução.br.com.bytebank.bytebankBanco.Teste;

import Introdução.br.com.bytebank.bytebankBanco.Modelo.Conta;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.ContaCorrente;
import Introdução.br.com.bytebank.bytebankBanco.Modelo.GuardadosDeContas;

public class TesteGuardadorContas {
    public static void main(String[] args) {

        GuardadosDeContas guardador = new GuardadosDeContas();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(1);
        System.out.println(ref.getNumero());

    }
}
