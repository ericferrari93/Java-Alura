package Introdução.br.com.bytebank.bytebankBanco.Teste;

public class TesteArrayPrimitivos {
    //Array
    public static void main(String[] args) {

        int [] idades = new int [5];//inicializa com os valores padrões 0

        for(int i = 0; i < idades.length; i++){
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

    }
}
