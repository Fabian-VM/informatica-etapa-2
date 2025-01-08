public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private int cantidadPorLote;

    public Producto(int id, String nombre, String descripcion, double precio, int stock, int cantidadPorLote) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.cantidadPorLote = cantidadPorLote;
    }
}
