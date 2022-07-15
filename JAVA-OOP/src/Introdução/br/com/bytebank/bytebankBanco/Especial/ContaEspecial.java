package Introdução.br.com.bytebank.bytebankBanco.Especial;

import Introdução.br.com.bytebank.bytebankBanco.Modelo.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor){
        super.saldo += valor;

    }

}
