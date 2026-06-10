public class Pedido {
    private int id;
    private Producto[] productos;
    private int cantidad;

    public Pedido(int id, int capacidad) {
        this.id = id;
        productos = new Producto[capacidad];
        cantidad = 0;
    }

    public void agregarProducto(Producto p) {
        if (cantidad < productos.length) {
            productos[cantidad] = p;
            cantidad++;
        }
    }

    public int getId() {
        return id;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getCantidad() {
        return cantidad;
    }
}
