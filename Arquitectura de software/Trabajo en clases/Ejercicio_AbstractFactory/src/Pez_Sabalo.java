public class Pez_Sabalo implements IPeces{
    private String nombre;
    private String longitud;

    public Pez_Sabalo() {
        this.nombre = "Sabalo";
        this.longitud = "50 cm";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Pez_Pacu{" +
                "nombre='" + nombre + '\'' +
                ", longitud='" + longitud + '\'' +
                '}';
    }

    @Override
    public void Nadar() {
        System.out.println("El pez puede nadar");
    }
}
