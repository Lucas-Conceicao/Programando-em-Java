package ex04;

public class Complexo {
    Double real;
    Double imaginario;

    public Complexo(Double real, Double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexo soma(Complexo outro){
        Double sReal = this.real + outro. real;
        Double sImaginario = this.imaginario + outro.imaginario;
        return new Complexo(sReal, sImaginario);
    }

    public Complexo multiplica(Complexo outro){
        Double mReal = (this.real * outro.real) - (this.imaginario * outro.imaginario);
        Double mImaginario = (this.real * outro.imaginario) - (this.imaginario * outro.real);
        return new Complexo(mReal,mImaginario);
    }

    public String toString(){
        return real + " + " + imaginario + "i";
    }

    public Double modulo( ){
        Double modulo = Math.sqrt((this.real * this.real) + (this.imaginario * this.imaginario));
        return modulo;
    }

    /*public Double argumentoPrincipal (){
        Double angulo = 

    }*/
}
