public class OperacionesMatematicas implements IoperacionesMatematicas{
    @Override
    public void sumaelementos(int[] elementos) {
        int suma = 0;
        for (int i = 0; i<elementos.length; i++){
            suma += elementos[i];
        }
        System.out.println("La suma de los numeros del arreglo es: " + suma);
    }
}
