import java.util.Objects;

public class Pessoa implements Comparable{
    private String cpf;
    private String nome;
    private int idade;

    @Override
    public boolean equals(Object o) {
        Pessoa outra = (Pessoa) o;
        return this.cpf.equals(outra.cpf);
    }

    @Override
    public int hashCode() {
        return idade;
    }

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Pessoa outra = (Pessoa) o;
        System.out.println(this.idade - outra.idade);
        return this.idade - outra.idade;
    }
}
