package Service;
import Model.Producto;

public class MovimientoInventario {
    private Producto producto; //referencia el prooducto
    private int cantidad; //cantidad que entra o sale
    private String tipo; //es si entra o sale

    public MovimientoInventario(Producto producto, int cantidad, String tipo) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    //getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void movimiento() {
        if (tipo.equalsIgnoreCase("ENTRADA")) { // "equalsIgnoreCase" ignora mayusculas y minusculas
            producto.setStock(producto.getStock() + cantidad);// agrega unidades al stock
        } else if (tipo.equalsIgnoreCase("SALIDA")) {
            if (producto.getStock() >= cantidad) { // se fija si la cantidad
                producto.setStock(producto.getStock() - cantidad);// quita unidades al stock
            } else {
                System.out.println("Error: stock insuficiente para realizar la salida");
            }
        }
    }



            public String mostrarDetalles () {
                return "Movimiento: " + tipo +  " |Producto: " + producto.getNombre() +
                        " |Código: " + producto.getCodigo() + " | Cantidad: " + cantidad +
                        " | Stock actual: " + producto.getStock();
            }
        }


