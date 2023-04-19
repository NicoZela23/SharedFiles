public class Mamiferos_Oso implements IMamiferos{

    private String nombre;
    private int Temperatura;
    private int Nrode_patas;
    private String Color;

    public Mamiferos_Oso() {
        this.nombre = "Oso";
        Temperatura = 37;
        Nrode_patas = 4;
        Color = "cafe";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(int temperatura) {
        Temperatura = temperatura;
    }

    public int getNrode_patas() {
        return Nrode_patas;
    }

    public void setNrode_patas(int nrode_patas) {
        Nrode_patas = nrode_patas;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Mamiferos{" +
                "nombre='" + nombre + '\'' +
                ", Temperatura=" + Temperatura +
                ", Nrode_patas='" + Nrode_patas + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }

    @Override
    public void gettemperatura() {
        System.out.println("La temperatura del mamifero es: " + getTemperatura());
    }
}
