package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        // Calculadora

        System.out.println("Exercício Calculadora");
        Calculadora.soma(2.5, 7.3);
        Calculadora.subtracao(30, 15.1);
        Calculadora.multiplicacao(8, 2014);
        Calculadora.divisao(30, 8);

        // Mensagem

        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem( 6);
        Mensagem.obterMensagem( 13);
        Mensagem.obterMensagem( 23);

        // Emprestismo

        System.out.println("Exercício Emprestimo");
        Emprestimo.calcular(500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(500, Emprestimo.getQuatroParcelas());
        Emprestimo.calcular(500, 6);

    }
}
