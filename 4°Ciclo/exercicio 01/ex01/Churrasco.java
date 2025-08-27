public class Churrasco {
    Double qntCarne;

    public void verificarConsumo(Pessoa p){
        if(p.idade < 3 || p.vegetariana == true){
            qntCarne += 0;
            System.out.println(p.nome + " não consumirá carne.");
        }
        else if(p.idade>3 && p.idade<13) {
            qntCarne += 1;
            System.out.println(p.nome + " consumirá 1kg de carne.");
        }
        else{
            qntCarne += 2;
            System.out.println(p.nome + " consumirá 2kg de carne.");
        }
    }
}
