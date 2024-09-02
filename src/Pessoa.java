public class Pessoa {
    // Atributos privados para o valor ser passado por get e set
    private String nome;
    private int idade;
    private char orientacaoSexual;

    // Metodo Construtor
    public Pessoa(String nome, int idade, char orientacaoSexual) {
        this.nome = nome;
        this.idade = idade;
        this.orientacaoSexual = orientacaoSexual;
    }

    // Get pegar o valor
    // Set definir valor
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getOrientacaoSexual() {
        return orientacaoSexual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setOrientacaoSexual(char orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", orientacaoSexual=" + orientacaoSexual +
                '}';
    }
}
