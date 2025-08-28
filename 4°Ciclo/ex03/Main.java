package ex03;

public class Main {
    public static void main(String[] args) {
        Complexo a = new Complexo(1.0,6.0);
        Complexo b = new Complexo(3.0,2.0);
        Complexo soma = a.soma(b);
        Complexo multiplica = a.multiplica(b);

        System.out.println("Resultado da soma dos números: " + soma);
        System.out.println("Resultado da multiplicacao dos números: " + multiplica);
        System.out.println("Módulo de " + a + ": "+ a.modulo());
        System.out.println("Módulo de " + b + ": "+ b.modulo());
    }
}
