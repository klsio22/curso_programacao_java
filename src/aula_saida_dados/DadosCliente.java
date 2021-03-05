package aula_saida_dados;

public class DadosCliente {
    private String nome ;
    private int idade;
    private double renda;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }

    public int getIdade() {
        return idade;
    }
}
