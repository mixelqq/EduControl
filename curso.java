public class curso {

    private final int id;
    private String nome;
    private String descricao;
    private final Turno turno;
    private final int vagasTotais;
    private int vagasOcupadas; // estado do objeto: começa sempre em 0

    public curso(int id, String nome, String descricao, Turno turno, int vagasTotais) {
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
        this.nome = nome;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
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

    // Operação que altera o estado do objeto
    public void adicionarAluno() {
        if (vagasOcupadas >= vagasTotais) {
            throw new IllegalStateException("Não há vagas disponíveis neste curso");
        }
        vagasOcupadas++;
        System.out.println("Aluno adicionado ao curso!");
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Turno: " + turno);
        System.out.println("Vagas ocupadas: " + vagasOcupadas + "/" + vagasTotais);
    }
}