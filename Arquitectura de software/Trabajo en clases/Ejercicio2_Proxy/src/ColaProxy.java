
import java.util.logging.Logger;
public class ColaProxy implements Icola{
    private Icola colaReal;
    private final static Logger LOGGER = Logger.getLogger(ColaProxy.class.getName());

    public ColaProxy(Icola colaReal){
        this.colaReal = colaReal;
    }

    @Override
    public Cola insertar(Cola cola, int elemento) {
        LOGGER.info("----Cuenta Proxy - Insertar Cola----");
        return colaReal.insertar(cola, elemento);
    }

    @Override
    public Cola eliminar(Cola cola) {
        LOGGER.info("----Cuenta Proxy - Eliminar Cola----");
        return colaReal.eliminar(cola);
    }

    @Override
    public void mostrar(Cola cola) {
        LOGGER.info("----Cuenta Proxy - Mostrar Cola----");
            colaReal.mostrar(cola);

    }
}
