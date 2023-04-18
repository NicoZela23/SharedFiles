public class trianguloRectangulo extends Figura{
    private double catetoOp;
    private double catetoady;

    public trianguloRectangulo(double catetoOp, double catetoady) {
        this.catetoOp = catetoOp;
        this.catetoady = catetoady;
    }
    public double calcularArea(){
        return (catetoOp * catetoady)/2;
    }
}
