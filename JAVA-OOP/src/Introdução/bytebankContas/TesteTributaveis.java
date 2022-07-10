package Introdução.bytebankContas;

public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calculo = new CalculadorDeImposto();
        calculo.registra(cc);
        calculo.registra(seguro);

        System.out.println(calculo.getValorImposto());



    }
}
