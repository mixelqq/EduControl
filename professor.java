public class professor {

    private final int id;
    private String nome;
    private String email;
    private boolean lecionando; // estado do objeto: começa sempre false

    public professor(int id, String nome, String email) {
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
        this.lecionando = false;
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

    public boolean isLecionando() {
        return lecionando;
    }

    // Operação que altera o estado do objeto
    public void lecionar() {
        if (lecionando) {
            throw new IllegalStateException("Professor já está lecionando");
        }
        lecionando = true;
        System.out.println("Professor lecionando!");
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Lecionando: " + lecionando);
    }
}