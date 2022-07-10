package Introdução.bytebankFuncionarios;

// Gerente é um funcionario, herda da classe Funcionario
public class EditorVideo extends Funcionario {

    public double getBonificacao(){
        System.out.println("Bonificação do Editor de Video");
        return 150;

    }

}
