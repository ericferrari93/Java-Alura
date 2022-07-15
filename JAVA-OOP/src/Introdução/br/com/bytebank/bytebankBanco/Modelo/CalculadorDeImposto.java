package Introdução.br.com.bytebank.bytebankBanco.Modelo;

public class CalculadorDeImposto implements Tributavel {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }
    public double getValorImposto() {
        return totalImposto;
    }
}
