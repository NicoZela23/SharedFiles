public class Cola1 implements Icola{
    @Override
    public Cola insertar(Cola cola, int elemento) {
        cola.insertar(elemento);
        return cola;
    }

    @Override
    public Cola eliminar(Cola cola) {
        cola.eliminar();
        return cola;
    }

    @Override
    public void mostrar(Cola cola) {
        cola.mostrar();
    }
}
