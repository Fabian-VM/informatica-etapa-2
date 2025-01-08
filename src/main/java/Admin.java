public class Admin extends Persona{
    private String usuario;
    private String contrasena;

    public Admin(int dni, String nombre, String apellido, String telefono, String usuario) {
        super(dni, nombre, apellido, telefono);
        this.usuario = usuario;
    }
}
