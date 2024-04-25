package edu.yago.anatomiadasclasses;

public class Nomes {

    // Não recomendado:
    double salMedio = 1500.23; // Variavel abreviada
    String emails = "teste@teste.com"; // plural quando o tipo de variavel só se corresponde a um valor
    String myName = "Yago"; // Utilizar somente um idioma para todas as variáveis, não misturar
    // Correto
    double salarioMedio = 1500.23;
    String email = "teste@teste.com";
    String[] emails1 = { "teste@teste.com", "teste2@teste.com" };
    String meuNome = "Yago";

    // Metodos devem ser nomeados como verbos
    // Ex:
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    public void abrirConexao() {
        
    }
}
