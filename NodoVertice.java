public class NodoVertice{
    Pasillos dato;
    NodoVertice siguiente;
    NodoAdyacente adyacente;
    boolean visitado;

    public NodoVertice(Pasillos dato){
        this.dato = dato;
        this.siguiente = null;
        this.adyacente = null;
        this.visitado = false;
    }
}
