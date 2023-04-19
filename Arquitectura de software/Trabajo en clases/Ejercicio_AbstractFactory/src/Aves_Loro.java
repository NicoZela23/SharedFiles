public class Aves_Loro implements IAves{
    private String nombre;
    private String peso;
    private String tamanoAlas;

    public Aves_Loro() {
        this.nombre = "Loro";
        this.peso = "350 g";
        this.tamanoAlas = "16 cm";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(String tamanoAlas) {
        this.tamanoAlas = tamanoAlas;
    }

    @Override
    public String toString() {
        return "Aves_Loro{" +
                "nombre='" + nombre + '\'' +
                ", peso='" + peso + '\'' +
                ", tamanoAlas='" + tamanoAlas + '\'' +
                '}';
    }

    @Override
    public void volar() {
        System.out.println("El ave puede volar");
    }
}

