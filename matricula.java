public class Matricula {

    private final int id;
    private final Aluno aluno;
    private final Curso curso;
    private final String data;
    private StatusMatricula status; // estado do objeto

    public Matricula(int id, Aluno aluno, Curso curso, String data) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID deve ser maior que zero");
        }
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno é obrigatório");
        }
        if (curso == null) {
            throw new IllegalArgumentException("Curso é obrigatório");
        }
        if (data == null || data.isBlank()) {
            throw new IllegalArgumentException("Data não pode ser vazia");
        }
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
        this.data = data;
        this.status = StatusMatricula.PENDENTE; // toda matrícula nasce pendente
    }

    public int getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getData() {
        return data;
    }

    public StatusMatricula getStatus() {
        return status;
    }

    // Operação que altera o estado do objeto
    public void confirmar() {
        if (status != StatusMatricula.PENDENTE) {
            throw new IllegalStateException("Só é possível confirmar uma matrícula pendente");
        }
        status = StatusMatricula.CONFIRMADA;
        System.out.println("Matrícula confirmada!");
    }

    // Operação que altera o estado do objeto
    public void cancelar() {
        if (status == StatusMatricula.CANCELADA) {
            throw new IllegalStateException("Matrícula já está cancelada");
        }
        status = StatusMatricula.CANCELADA;
        System.out.println("Matrícula cancelada!");
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);
    }
}