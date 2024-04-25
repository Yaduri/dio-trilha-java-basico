package edu.yago.tiposevariaveis;

public class TiposVariaveis {

    public static void main(String[] args) {
        // Declaração de variavel
        // Tipo + nome + valor (opcional)
        int idade;
        int anoFrabricaçao = 2024;
        double salarioMinimo = 2500;
        float pi = 3.14F; // Tipo float precisa encerrar com F
        long longo = 123456789123L; // Precisa encerrar com L

        // Para constantes
        // final + Tipo + NOME (EM CAIXA ALTA) + valor

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
