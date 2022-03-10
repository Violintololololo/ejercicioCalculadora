package org.oscar.rest.modelo;

public class Calculadora {
    private int sum1,sum2,rest1,rest2,mult1,mult2,div1,div2;

    public Calculadora() {
    }

    public Calculadora(int sum1, int sum2, int rest1, int rest2, int mult1, int mult2, int div1, int div2) {
        this.sum1 = sum1;
        this.sum2 = sum2;
        this.rest1 = rest1;
        this.rest2 = rest2;
        this.mult1 = mult1;
        this.mult2 = mult2;
        this.div1 = div1;
        this.div2 = div2;
    }

    public int getSum1() {
        return sum1;
    }

    public void setSum1(int sum1) {
        this.sum1 = sum1;
    }

    public int getSum2() {
        return sum2;
    }

    public void setSum2(int sum2) {
        this.sum2 = sum2;
    }

    public int getRest1() {
        return rest1;
    }

    public void setRest1(int rest1) {
        this.rest1 = rest1;
    }

    public int getRest2() {
        return rest2;
    }

    public void setRest2(int rest2) {
        this.rest2 = rest2;
    }

    public int getMult1() {
        return mult1;
    }

    public void setMult1(int mult1) {
        this.mult1 = mult1;
    }

    public int getMult2() {
        return mult2;
    }

    public void setMult2(int mult2) {
        this.mult2 = mult2;
    }

    public int getDiv1() {
        return div1;
    }

    public void setDiv1(int div1) {
        this.div1 = div1;
    }

    public int getDiv2() {
        return div2;
    }

    public void setDiv2(int div2) {
        this.div2 = div2;
    }
    
    
}
