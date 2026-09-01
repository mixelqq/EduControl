public class Main {

    public static void main(String[] args) {

        System.out.println("=== EduControl ===");

        // Dados de demonstração — todos os objetos nascem em estado válido
        Aluno miguel = new Aluno(1, "Miguel", "miguel@email.com");
        Professor carlos = new Professor(1, "Carlos", "carlos@email.com");
        Curso poo = new Curso(1, "Programação Orientada a Objetos", "Fundamentos de POO em Java", Turno.NOTURNO, 1);

        // Operações que alteram o estado dos objetos
        carlos.lecionar();
        miguel.matricular();
        poo.adicionarAluno();
        carlos.adicionarCurso(poo); // associação Professor -> Curso (um professor leciona vários cursos)

        Matricula matriculaMiguel = new Matricula(1, miguel, poo, "2026-08-17");
        matriculaMiguel.confirmar();

        System.out.println();
        miguel.exibirInformacoes();
        System.out.println();
        carlos.exibirInformacoes();
        System.out.println();
        poo.exibirInformacoes();
        System.out.println();
        matriculaMiguel.exibirInformacoes();

        // Exemplo de invariante sendo protegida: curso só tem 1 vaga,
        // então adicionar um segundo aluno deve falhar
        try {
            poo.adicionarAluno();
        } catch (IllegalStateException e) {
            System.out.println("\nErro esperado: " + e.getMessage());
        }

        // Exemplo de construtor rejeitando dados inválidos
        try {
            new Aluno(2, "", "sememail");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}