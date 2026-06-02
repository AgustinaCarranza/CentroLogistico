public class PilaMovimientos {
    private NodoMovimiento tope;

    public PilaMovimientos(){
        tope = null;
    }
    public void apilar(MovimientoInventario mov){
        NodoMovimiento nuevo = new NodoMovimiento(mov);
        nuevo.siguiente = tope;
        tope = nuevo;
    }
}
