package um;

import java.util.Arrays;

public class AP1 {
    public static void main(String[] args) {
        class Vetor{
            public String[] alunos;
            public String aluno;
            public Double[] notas;
            public Double nota;
            public Vetor (int capacidade){
                this.alunos = new String[capacidade];
                this.notas = new Double[capacidade];
            }

            public void adicionarAluno(){
                int x = 10;
                for (int i = 0; i < alunos.length; i++) {
                    aluno = ("Aluno" + i).toString();
                    nota = Math.random() * x;
                    Double notaArredondada = (Math.round(nota * 100.0) / 100.0);
                    if (alunos[i] == null) {
                        alunos[i] = aluno;
                        notas[i] = notaArredondada;
                        System.out.println("Aluno " + i + " com nota: " + notaArredondada + " adicionado com sucesso!");
                    }
                }
                System.out.println("Quantidade de Alunos: " + alunos.length);
            }

            public void calcularMedia() {
                Double media = 0.00;
                for (int i = 0; i < alunos.length; i++) {
                    media += notas[i];
                }
                media = media / alunos.length;
                Double mediaArredondada = (Math.round(media * 100.0) / 100.0);
                System.out.println("Media da Turma: " + mediaArredondada);
            }

            public void alunoAcimaMedia(){
                for (int i = 0; i < alunos.length; i++) {
                    if (notas[i] > 7){
                        System.out.println("O aluno " + alunos[i] + " com nota " + notas[i] + " está acima da média");
                    }
                }
            }

            public void melhoresTurma(){
                int ranking = 5;
                for (int i = 0; i < notas.length; i++) {
                    for (int j = 0; j < notas.length - i - 1; j++) {
                        if (notas[j] < notas[j + 1]){
                            Double temp = notas[j];
                            String alunoTemp = alunos[j];

                            notas[j] = notas[j + 1];
                            alunos[j] = alunos[j + 1];

                            notas[j + 1] = temp;
                            alunos[j + 1] = alunoTemp;
                        }
                    }
                }
                System.out.println();
                System.out.println("=== MELHORES DA TURMA ===");
                for (int i = 0; i < ranking; i++) {
                    System.out.println((i + 1) + "ºLugar: " + alunos[i] + " com a nota: " + notas[i]);
                }
            }
        }  // Atividade 01

        class Matriz {
            public Double[][] temperaturas;
            public Double temperatura;
            public String[] cidades;
            public String cidade;

            public Matriz(int numeroCidades, int qtdTemperaturas) {
                this.cidades = new String[numeroCidades];
                this.temperaturas = new Double[numeroCidades][qtdTemperaturas];
            }

            public void adicionarCidadeETempeturatura(){
                int min = -5;
                int max = 42;

                for (int i = 0; i < cidades.length; i++) {
                    this.cidades[i] = "Cidade " + i;

                    for (int j = 0; j < temperaturas[i].length; j++) {

                        this.temperatura = Math.random() * (max - min) + min;
                        Double temperaturaArredondada = (double)Math.round(this.temperatura * 100.0) / 100.0;
                        this.temperaturas[i][j] = temperaturaArredondada;;
                    }
                }
                // Exibir os dados corretamente
                for (int i = 0; i < cidades.length; i++) {
                    System.out.println(cidades[i] + " - Temperaturas: " + Arrays.toString(temperaturas[i]));
                }
            }
            public void mediaTemperaturaPorCidade(){
                Double media = 0.00;
                for (int i = 0; i < cidades.length; i++) {
                    for (int j = 0; j < temperaturas[i].length; j++) {
                        media += temperaturas[i][j];
                    }
                    media = media / temperaturas[i].length;
                    Double mediaArredondada = (double)Math.round(media * 100.0) / 100.0;
                    System.out.println("Média de temperatura da " + cidades[i] + ":");
                    System.out.println(mediaArredondada + "ºC");
                    System.out.println();
                }
            }
        }

        Vetor vetor = new Vetor(30);
        vetor.adicionarAluno();
        vetor.calcularMedia();
        vetor.alunoAcimaMedia();
        vetor.melhoresTurma();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=== ATIVIDADE 02 ===");

        Matriz matriz = new Matriz(5, 7);
        matriz.adicionarCidadeETempeturatura();
        matriz.mediaTemperaturaPorCidade();
    }
}
