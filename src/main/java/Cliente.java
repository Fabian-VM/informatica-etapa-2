public class Cliente extends Persona {
    private Localidad localidad;
    private String direccion;

    public Cliente(int dni, String nombre, String apellido, String telefono, Localidad localidad, String direccion) {
        super(dni, nombre, apellido, telefono);
        this.localidad = localidad;
        this.direccion = direccion;
    }
}
