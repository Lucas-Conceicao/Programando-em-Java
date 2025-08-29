/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex02;

/**
 *
 * @author Lucas
 */


public class Main{
    public static void main(String[] args) {
        Lampada lampada = new Lampada(Estado.OFF);
        lampada.click();
        lampada.click();
        lampada.click();
        lampada.click();
        lampada.click();
        lampada.click();
        lampada.checaEstado();
        System.out.println("Quantidade de acendimentos: " + lampada.qtdAcendimentos);
    }
}
