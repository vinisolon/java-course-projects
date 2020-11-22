package entidades;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String cpf;
    private Integer idade;

    public Pessoa(String nome, String cpf, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados
                .append("Nome: ").append(nome)
                .append(" CPF: ").append(cpf)
                .append(" Idade: ").append(idade);
        return dados.toString();
    }

    @Override
    public int compareTo(Pessoa outro) {
        return nome.toUpperCase().compareTo(outro.getNome().toUpperCase());
    }
}
