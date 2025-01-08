public class Personal extends Persona{
    private boolean ocupado;
    private Vehiculo vehiculo;

    public Personal(int dni, String nombre, String apellido, String telefono, boolean ocupado) {
        super(dni, nombre, apellido, telefono);
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
