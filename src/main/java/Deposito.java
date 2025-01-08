public class Deposito {
    private int id;
    private String nombre;
    private Localidad localidad;
    private boolean disponible;

    public Deposito(int id, String nombre, Localidad localidad) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.disponible = false;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
