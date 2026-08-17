public class aluno {

    private final int id;
    private String nome;
    private String email;
    private boolean matriculado; // estado do objeto: começa sempre false

    public aluno(int id, String nome, String email) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID deve ser maior que zero");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.matriculado = false;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    // Operação que altera o estado do objeto
    public void matricular() {
        if (matriculado) {
            throw new IllegalStateException("Aluno já está matriculado");
        }
        matriculado = true;
        System.out.println("Aluno matriculado com sucesso!");
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Matriculado: " + matriculado);
    }
}