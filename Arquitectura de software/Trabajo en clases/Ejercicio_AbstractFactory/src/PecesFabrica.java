public class PecesFabrica implements IFabricaAbstracta{
    @Override
    public IMamiferos getMamifero(String mamifero) {
        return null;
    }

    @Override
    public IAves getAve(String Ave) {
        return null;
    }

    @Override
    public IPeces getPez(String Pez) {
        if(Pez == null){
            return new PezVacio();
        }
        if(Pez.equalsIgnoreCase("Pacu")){
            return new Pez_Pacu();
        }else if (Pez.equalsIgnoreCase("Sabalo")){
            return new Pez_Sabalo();
        }
        return new PezVacio();
    }
}
