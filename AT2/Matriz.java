package AT2;

import java.util.Random;

public class Matriz {
    private double[][] temperaturas; // Matriz 5x7 para armazenar as temperaturas

    public Matriz() {
        temperaturas = new double[5][7]; // Inicializa a matriz
    }

    // Preenche a matriz com temperaturas aleatórias entre 15°C e 40°C
    public void preencherTemperaturas() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                temperaturas[i][j] = 5 + random.nextDouble() * 25; // gera números aleatórios entre 5 e 30
            }
        }
    }

    // Calcula a média de temperatura de cada cidade
    public double[] calcularMediaPorCidade() {
        double[] medias = new double[5];
        for (int i = 0; i < 5; i++) {
            double soma = 0; // A variável 'soma' é reiniciada para 0 a cada iteração do for de fora
            for (int j = 0; j < 7; j++) {
                soma += temperaturas[i][j];
            }
            medias[i] = soma / 7;
        }
        return medias;
    }

    // Identifica o dia mais quente de cada cidade
    public int[] diaMaisQuente() {
        int[] diasQuentes = new int[5];
        for (int i = 0; i < 5; i++) {
            int dia = 0;
            double maxTemp = temperaturas[i][0];
            for (int j = 1; j < 7; j++) {
                if (temperaturas[i][j] > maxTemp) {
                    maxTemp = temperaturas[i][j];
                    dia = j;
                }
            }
            diasQuentes[i] = dia + 1; // Dia começa em 1
        }
        return diasQuentes;
    }

    // Encontra a cidade com maior variação térmica
    public int cidadeMaiorVariacaoTermica() {
        int cidade = 0;
        double maiorVariacao = 0;
        for (int i = 0; i < 5; i++) {
            double minTemp = temperaturas[i][0];
            double maxTemp = temperaturas[i][0];
            for (int j = 1; j < 7; j++) {
                if (temperaturas[i][j] < minTemp) minTemp = temperaturas[i][j];
                if (temperaturas[i][j] > maxTemp) maxTemp = temperaturas[i][j];
            }
            double variacao = maxTemp - minTemp;
            if (variacao > maiorVariacao) {
                maiorVariacao = variacao;
                cidade = i;
            }
        }
        return cidade + 1; // Cidade começa em 1
    }

    // Exibir resultados
    public void exibirResultados() {
        double[] medias = calcularMediaPorCidade();
        int[] diasQuentes = diaMaisQuente();
        int cidadeMaiorVariacao = cidadeMaiorVariacaoTermica();

        System.out.println("Médias de temperatura por cidade:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Cidade %d: %.2f°C\n", i + 1, medias[i]);
        }

        System.out.println("\nDia mais quente de cada cidade:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Cidade %d: Dia %d\n", i + 1, diasQuentes[i]);
        }

        System.out.println("\nCidade com maior variação térmica: Cidade " + cidadeMaiorVariacao);
    }
}
