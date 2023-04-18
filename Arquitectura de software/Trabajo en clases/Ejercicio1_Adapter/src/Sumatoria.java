public class Sumatoria {

    public void sumatoria(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La somatoria de " + n + " " + "es: " + suma);
    }
}
