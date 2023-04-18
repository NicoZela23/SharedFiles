public class SumaAdapter implements IoperacionesMatematicas{

    private Suma suma;
    public SumaAdapter(){
        this.suma = new Suma();
    }
    @Override
    public void sumaelementos(int[] elementos) {
        this.suma.sumar(elementos[0],elementos[1]);
    }
}
