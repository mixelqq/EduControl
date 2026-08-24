public class Curso {

    private final int id;
    private String nome;
    private String descricao;
    private final Turno turno;
    private final int vagasTotais;
    private int vagasOcupadas; // estado do objeto: começa sempre em 0

    public Curso(int id, String nome, String descricao, Turno turno, int vagasTotais) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID deve ser maior que zero");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (turno == null) {
            throw new IllegalArgumentException("Turno é obrigatório");
        }
        if (vagasTotais <= 0) {
            throw new IllegalArgumentException("Número de vagas deve ser maior que zero");
        }

        this.id = id;
        this.nome = nome.trim();
        this.descricao = descricao == null ? "" : descricao.trim();
        this.turno = turno;
        this.vagasTotais = vagasTotais;
        this.vagasOcupadas = 0;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome.trim();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao == null ? "" : descricao.trim();
    }

    public Turno getTurno() {
        return turno;
    }

    public int getVagasTotais() {
        return vagasTotais;
    }

    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void adicionarAluno() {
        if (vagasOcupadas >= vagasTotais) {
            throw new IllegalStateException("Não há vagas disponíveis neste curso");
        }

        vagasOcupadas++;
        System.out.println("Aluno adicionado ao curso!");
    }

    public void removerAluno() {
        if (vagasOcupadas <= 0) {
            throw new IllegalStateException("Não há alunos matriculados neste curso");
        }

        vagasOcupadas--;
        System.out.println("Aluno removido do curso!");
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Turno: " + turno);
        System.out.println("Vagas ocupadas: " + vagasOcupadas + "/" + vagasTotais);
    }
}