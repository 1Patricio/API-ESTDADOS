package um;

public class AP1 {
    public static void main(String[] args) {
        class Vetor{
            public String[] alunos;
            public String aluno;
            public float notas;
            public Vetor (int capacidade){
                this.alunos = new String[capacidade];
            }

            public void adicionarAluno(){
                for (int i = 0; i < alunos.length; i++) {
                    aluno = ("Aluno" + i).toString();
                    if (alunos[i] == null) {
                        alunos[i] = aluno;
                        System.out.println("Aluno " + i + " adicionado com sucesso!");
                    }
                }
                System.out.println("Quantidade de Alunos: " + alunos.length);
            }

            public void adicionarNota(){
                for (int i = 0; i < alunos.length; i++) {

                }
            }


        }

        class Aluno {
            String nome;
            float nota = ;

            public Aluno (String nome, float nota){
                this.nome = nome;
                this.nota = nota;
            }

            public void adicionarNota()
        }

        Vetor vetor = new Vetor(30);
        vetor.adicionarAluno();
    }
}
