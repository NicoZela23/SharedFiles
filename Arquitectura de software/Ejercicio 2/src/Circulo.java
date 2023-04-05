public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }
}
