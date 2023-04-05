public class CalculoImpuesto{
    private double impuesto;
    public CalculoImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double calcularImpuesto(double salario){
        return salario * impuesto;
    }

}
