package Introdução.br.com.bytebank.bytebankBanco.Modelo;

public class GuardadosDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadosDeReferencias(){
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }
    public void adiciona(Object ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }
    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
