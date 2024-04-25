package edu.yago.anatomiadasclasses;
// O nome da classe sempre deve ser igual ao nome do arquivo
// Iniciando em letra maiúscula
public class MinhaClasse {

    public static void main(String[] args) {
        // Para printar no terminal
        System.out.println("Teste");

        // Ao colocar final, a variavel não pode ser alterada. Vira IMUTAVEL.
        // E geralmente ela fica toda em maiúscula
        // final String BR = "Brasil";
        // final double PI = 3.14;

        // As váriaveis geralmente começam com letras minúsculas, _ (underline) ou $
        // (Sifrao)
        // int numero1$ = 1;

        String meuNome = nomeCompleto("Yago", "Duarte");
        System.out.println(meuNome);
    }

    // Para métodos, utilizar a estrutura abaixo
    // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
    // int somar (int numeroUm, int numeroDois)
    // String formatarCep (long cep)
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        // return primeiroNome + " " + segundoNome;
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
