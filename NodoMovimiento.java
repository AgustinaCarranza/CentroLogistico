public class NodoMovimiento {
    MovimientoInventario dato;
    NodoMovimiento siguiente;

    public NodoMovimiento(MovimientoInventario dato){
        this.dato = dato;
        this.siguiente = null;
    }
}

