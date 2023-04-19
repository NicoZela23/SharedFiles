public class MamiferosFabrica implements IFabricaAbstracta{
    @Override
    public IMamiferos getMamifero(String mamifero) {
        if(mamifero == null){
            return new MamiferoVacio();
        }
        if(mamifero.equalsIgnoreCase("Leon")){
            return new Mamiferos_Leon();
        }else if (mamifero.equalsIgnoreCase("Oso")){
            return new Mamiferos_Oso();
        } else if (mamifero.equalsIgnoreCase("Mono")) {
            return new Mamiferos_Mono();
        }
        return new MamiferoVacio();
    }

    @Override
    public IAves getAve(String Ave) {
        return null;
    }

    @Override
    public IPeces getPez(String Pez) {
        return null;
    }
}
