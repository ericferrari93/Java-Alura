package Introdução.bytebankFuncionarios;

public class AutenticacaoUtil {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha){
            System.out.println("Senha Correta");
            return true;
        }else{
            System.out.println("Senha Incorreta");
            return false;
        }
    }

}
