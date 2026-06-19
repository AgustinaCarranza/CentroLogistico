package TDA;
import Service.MovimientoInventario;

public class PilaMovimientos {
    private NodoMovimiento tope;

    public PilaMovimientos(){
        tope = null;
    } //al inicio la pila esta vacia
    //agrega un nuevo movimiento en la cima
    public void apilar(MovimientoInventario mov){
        NodoMovimiento nuevo = new NodoMovimiento(mov);//crea un nodo con el movimiento
        nuevo.siguiente = tope;//lo enlaza con el tope anterior
        tope = nuevo;//se actualiza
    }
    public MovimientoInventario desapilar(){
        if (tope != null){
            MovimientoInventario mov = tope.dato;//guarda el movimiento del nodo tope
            tope = tope.siguiente;//mueve el tope al siguiente nodo
            return mov;//devuelve el movimiento desapilado
        }
        return null;//si esta vacia devuelve null
    }
    //verifica si esta vacia
    public boolean estaVacia(){
        return tope == null;
    }
    public void mostrarMovimientos(){
        NodoMovimiento actual = tope;
        while (actual != null){//recorre hasta que no haya mas nodos
            System.out.println(actual.dato.mostrarDetalles());//el mostrarDestalles()
            //lo usa para imprimir cada movimiento
            actual = actual.siguiente;
        }
    }

    public void mostrarHistorial() {
        NodoMovimiento aux = tope;

        while (aux != null) {
            System.out.println(aux.dato.mostrarDetalles());
            aux = aux.siguiente;
        }
    }

}
