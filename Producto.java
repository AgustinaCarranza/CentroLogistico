public class Producto {
    private String nombre;
    private int codigo;
    private int stock;

    public Producto(String nombre, int codigo, int stock){
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public int getCodigo(){ return codigo; }
    public int getStock() { return stock; }
    public void setStock(int nuevoStock) {this.stock = nuevoStock; }
}
