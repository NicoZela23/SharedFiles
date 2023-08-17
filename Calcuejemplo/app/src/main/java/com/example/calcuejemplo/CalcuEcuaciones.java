package com.example.calcuejemplo;

public class CalcuEcuaciones {
    private float a;
    private float b;
    private float c;
    private float d;
    private float PR;
    private float PI;
    private String RES;

    public CalcuEcuaciones(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public float getPR() {
        return PR;
    }

    public void setPR(float PR) {
        this.PR = PR;
    }

    public float getPI() {
        return PI;
    }

    public void setPI(float PI) {
        this.PI = PI;
    }

    public String getRES() {
        return RES;
    }

    public void setRES(String RES) {
        this.RES = RES;
    }

    public void suma(){
        this.PR = this.a + this.b;
        this.PI = this.b + this.d;
        this.RES = String.valueOf(PR) + '+' + String.valueOf(PI) + 'i';
    }
    public void resta(){
        this.PR = this.a - this.c;
        this.PI = this.b - this.d;
        this.RES = String.valueOf(PR) + '+' + String.valueOf(PI) + 'i';
    }
    public void multi(){
        this.PR = (this.a*this.c) - (this.b*this.d);
        this.PI = (this.a*this.d) + (this.b*this.c);
        this.RES = String.valueOf(PR) + '+' + String.valueOf(PI) + 'i';
    }
    public void divi(){
        this.PR = (this.a*this.c) + (this.b*this.d) / (this.c*this.c) + (this.d*this.d);
        this.PI = (this.b*this.c) - (this.a*this.d) / (this.c*this.c) + (this.d*this.d);
        this.RES = String.valueOf(PR) + '+' + String.valueOf(PI) + 'i';
    }
}
