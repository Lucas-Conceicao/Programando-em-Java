public class Pessoa {
    String nome;
    Sexo sexo;  //enum
    int idade;
    boolean vegetariana;

    public Pessoa(String nome, Sexo sexo, int idade, boolean vegetariana) {
        this.nome = nome;
        this.idade = idade;
        this.vegetariana = vegetariana;
    }
}
