//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Localidad pmy = new Localidad(9120, "Puerto Madryn");
        Localidad tw = new Localidad(9100, "Trelew");

        Deposito d1 = new Deposito(1, "El cacito", pmy);
        Producto botas = new Producto(1, "Botas de trabajo", "Botas blancas para trabajar en pesqueras", 300000, 100, 10);

        Cliente c1 = new Cliente(100, "Pancho", "Roquez", "0800", tw, "Av. Gales 500");

        Personal l1 = new Personal(100, "Rasta", "Martinez", "0200", false);
        Vehiculo v1 = new Vehiculo("AAA 000", 1, pmy, false, true);

        // Generar pedido
        Pedido p1 = new Pedido(1, 600000,2, botas, c1);

        // Funcionalidad
        p1.setEstado(Estado.EN_PREPARACION);
        v1.addPedido(p1);
        v1.setChofer(l1);
        p1.setEstado(Estado.EN_CAMINO);

        p1.setEstado(Estado.CONCLUIDO);


    }
}