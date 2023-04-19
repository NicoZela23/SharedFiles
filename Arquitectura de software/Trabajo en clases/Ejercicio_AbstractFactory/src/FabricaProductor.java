public class FabricaProductor {
    public static IFabricaAbstracta getFactory(String tipoFabrica){
        if(tipoFabrica.equalsIgnoreCase("Mamifero")){
            return new MamiferosFabrica();
        } else if (tipoFabrica.equalsIgnoreCase("Ave")){
            return new AvesFabrica();
        } else if (tipoFabrica.equalsIgnoreCase("Pez")){
            return new PecesFabrica();
        }
        return null;
    }
}
