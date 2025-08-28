public class lampada{
    Estado estado;

    public lampada(Estado estado){
        this.estado = estado;
    }

    public void click(){
        if (this.estado == Estado.ON)
            this.estado = Estado.OFF;
        else
            this.estado = Estado.ON;

        qtdAcendimentos();
    }

    ?public void qtdAcendimentos(){
        int qtdAcendimentos++;
    }

    public void checaEstado(){
        switch(lampada.estado){
            case off:
                system.out.println("A lâmpada está desligada.");
            break;
            case on:
                system.out.println("A lâmpada está ligada.");
            break;
        }

    }
}