package ej2_guia9.entidades;


public class ParDeNumeros {
    
    public float num1;
    public float num2;

    public ParDeNumeros() {
        this.num1=(float) (Math.random() * 21)-10;
        this.num2=(float) (Math.random() * 21)-10;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    
    
    

}
