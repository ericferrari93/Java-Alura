package Introdução.br.com.bytebank.bytebankFuncionarios;

// Gerente é um funcionario, herda da classe Funcionario
public class Designer extends Funcionario {

    public double getBonificacao(){
        System.out.println("Bonificação do Designer");
        return 200;

    }

}
