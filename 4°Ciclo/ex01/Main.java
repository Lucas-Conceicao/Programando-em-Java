public class Main{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", Sexo.masc, 2, false);
        Pessoa p2 = new Pessoa("Maria", Sexo.fem, 10, false);
        Pessoa p3 = new Pessoa("Ana", Sexo.masc, 25, true);
        Pessoa p4 = new Pessoa("Carlos", Sexo.fem, 30, false);

        Churrasco churrasco = new Churrasco();

        churrasco.verificarConsumo(p1);
        churrasco.verificarConsumo(p2);
        churrasco.verificarConsumo(p3);
        churrasco.verificarConsumo(p4);

        System.out.println("Quantidade total de carne necessária: " + churrasco.qntCarne + " Kg");
    }
}
