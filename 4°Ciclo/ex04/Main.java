package ex04;

public class Main{
    public static void main(String[] args) {
        Cliente a = new Cliente("lucas",2015.45,2200.00);

        System.out.println("Saldo atual:" + a.getSaldo());
        System.out.println("--------------------");

        try{
        System.out.println("Tentando sacar");
        a.sacar(3000.0);
        }catch(IllegalArgumentException e){
             System.out.println(e.getMessage());
        }
        System.out.println("--------------------");
        System.out.println("Saldo atual:" + a.getSaldo());
        System.out.println("--------------------");

        try{
        a.depositar(-10.0);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
