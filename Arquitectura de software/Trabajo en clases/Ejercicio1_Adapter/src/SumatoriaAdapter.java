public class SumatoriaAdapter implements IoperacionesMatematicas{
    private Sumatoria sumatoria;
    public SumatoriaAdapter(){
        this.sumatoria = new Sumatoria();
    }
    @Override
    public void sumaelementos(int[] elementos) {
        this.sumatoria.sumatoria(elementos[0]);
    }
}
