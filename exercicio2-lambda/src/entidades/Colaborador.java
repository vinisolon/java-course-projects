package entidades;

public class Colaborador {
    private String nome;
    private String email;
    private Double salario;

    public Colaborador(String nome, String email, Double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder printColaborador = new StringBuilder()
                .append(nome).append(", ")
                .append(email).append(", ")
                .append(salario);
        return printColaborador.toString();
    }
}
