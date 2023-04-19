public class AvesFabrica implements IFabricaAbstracta{
    @Override
    public IMamiferos getMamifero(String mamifero) {
        return null;
    }

    @Override
    public IAves getAve(String Ave) {
        if(Ave == null){
            return new AveVacia();
        }
        if(Ave.equalsIgnoreCase("Loro")){
            return new Aves_Loro();
        }else if (Ave.equalsIgnoreCase("Aguila")){
            return new Aves_Aguila();
        } else if (Ave.equalsIgnoreCase("Condor")) {
            return new Aves_Condor();
        }
        return new AveVacia();
    }

    @Override
    public IPeces getPez(String Pez) {
        return null;
    }
}
