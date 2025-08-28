package org.fatec.ex02;

public class Lampada{
    Estado estado;
    int qtdAcendimentos = 0;

    public Lampada(Estado estado){
        this.estado = estado;
    }

    public void click(){
        switch(this.estado){
            case OFF -> {
                this.estado = Estado.ON;
                qtdAcendimentos();
            }
            case ON -> this.estado = Estado.OFF;
        }
    }

    public void qtdAcendimentos( ){
        qtdAcendimentos++;
    }

    public void checaEstado(){
        switch(this.estado){
            case OFF -> System.out.println("A lâmpada está desligada.");
            case ON -> System.out.println("A lâmpada está ligada.");
        }
    }
}
