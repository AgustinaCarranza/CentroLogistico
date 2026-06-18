package TDA;
import Model.Pasillos;

public class NodoAdyacente {
    Pasillos dato;
    NodoAdyacente siguiente;

    public NodoAdyacente(Pasillos dato){
        this.dato = dato;
        this.siguiente = null;
    }
    public Pasillos getDato(){ return dato; }
}
