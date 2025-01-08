import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String patente;
    private int unidad;
    private Localidad localidad;
    private Personal chofer;
    private List<Pedido> pedidos;
    private boolean ocupado;
    private boolean usable;

    public Vehiculo(String patente, int unidad, Localidad localidad, boolean ocupado, boolean usable) {
        this.patente = patente;
        this.unidad = unidad;
        this.localidad = localidad;
        this.chofer = chofer;
        this.ocupado = ocupado;
        this.usable = usable;
        this.pedidos = new ArrayList<>();
        this.chofer = null;
    }

    public String getPatente() {
        return patente;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Personal getChofer() {
        return chofer;
    }

    public void setChofer(Personal chofer) {
        chofer.setVehiculo(this);
        this.chofer = chofer;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        pedido.setVehiculo(this);
        this.pedidos.add(pedido);
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isUsable() {
        return usable;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }
}
