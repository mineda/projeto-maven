package br.gov.sp.fatec.projetomaven;

public class Calculadora {
    
    private double n1, n2;
    
    public Calculadora (double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public Calculadora() {
        this(5.0, 5.0);
    }
    
    public double soma() {
        return n1 + n2;
    }

    public double sub() {
        return n1 - n2;
    }

    public double mult() {
        return n1 * n2;
    }

    public double div() {
        return n1/n2;
    }

}
