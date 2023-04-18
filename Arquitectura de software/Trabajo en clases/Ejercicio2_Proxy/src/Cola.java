public class Cola {
    private int[] elementos;
    private int frente;
    private int finalCola;
    private int tamañoMaximo;

    public Cola(int tamaño) {
        this.tamañoMaximo = tamaño;
        this.elementos = new int[tamaño];
        this.frente = -1;
        this.finalCola = -1;
    }

    public boolean estaVacia() {
        return frente == -1;
    }

    public boolean estaLlena() {
        return finalCola == tamañoMaximo - 1;
    }

    public void insertar(int elemento) {
        if (estaLlena()) {
            System.out.println("La cola está llena.");
        } else {
            if (estaVacia()) {
                frente = 0;
            }
            finalCola++;
            elementos[finalCola] = elemento;
        }
    }

    public int eliminar() {
        int elementoEliminado = 0;
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            elementoEliminado = elementos[frente];
            if (frente == finalCola) {
                frente = -1;
                finalCola = -1;
            } else {
                frente++;
            }
        }
        return elementoEliminado;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.print("Elementos de la cola: ");
            for (int i = frente; i <= finalCola; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}
