package entidades;

public class Funcionario implements Comparable<Funcionario>{

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionario obj) {
        //return nome.compareTo(obj.getNome());           // Retorna os funcionarios por odem alfabetica A-Z
        return -nome.compareTo(obj.getNome());           // Retorna os funcionarios por odem alfabetica Z-A
        //return salario.compareTo(obj.getSalario());     // Retorna os funcionarios por ordem crescente do salario
        //return -salario.compareTo(obj.getSalario());    // Retorna os funcionarios por ordem decrescente do salario
    }
}
