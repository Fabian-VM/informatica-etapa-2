public class Pedido {
    private int id;
    private double precioFinal;
    private int cantidad;
    private Producto producto;
    private Cliente cliente;
    private Estado estado;
    private Vehiculo vehiculo;

    public Pedido(int id, double precioFinal, int cantidad, Producto producto, Cliente cliente) {
        this.id = id;
        this.precioFinal = precioFinal;
        this.cantidad = cantidad;
        this.producto = producto;
        this.cliente = cliente;
        this.estado = Estado.EN_PREPARACION;
        this.vehiculo = null;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
