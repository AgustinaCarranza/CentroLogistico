public class GrafosPasillos implements IGrafoPasillos {
    private NodoVertice primero;//no ponemos T porque solo lo vamos a usar con pasillos
    private boolean dirigido;

    public GrafosPasillos(boolean dirigido){
        this.primero = null;
        this.dirigido = dirigido;
    }

    @Override
    public void insertarVertice(Pasillos pasillo) {
        if (existeVertice(pasillo)) return;
        NodoVertice nuevo = new NodoVertice(pasillo);
        if (primero == null){
            primero = nuevo;
        } else {
            NodoVertice aux = primero;
            while (aux.siguiente != null) aux = aux.siguiente;
            aux.siguiente = nuevo;
        }

    }

    @Override
    public boolean existeVertice(Pasillos pasillo) {//recorre la lista de vertices
        NodoVertice aux = primero;
        while (aux != null){
            if (aux.dato.getId() == pasillo.getId()) return true;//verifica si esta el pasillo
            aux = aux.siguiente;//sino lo encuentra pasa al otro
        }
        return false;//sino devuelve falso
    }

    @Override
    public void insertarArista(Pasillos origen, Pasillos destino){
        insertarVertice(origen);//asegura que los vertices origen y destino existan en el grafo
        insertarVertice(destino);
        agregarAdyacente(origen, destino);//conexion entre ambas
        if (!dirigido) agregarAdyacente(destino, origen);//en caso de que no sea dirigido se agrega la conexion inversa
    }
    private void agregarAdyacente(Pasillos origen, Pasillos destino){
        NodoVertice verticeOrigen = buscarVertice(origen);//busca el vertice correspondiente al pasillo origen
        if (verticeOrigen == null) return;
        NodoAdyacente nuevo = new NodoAdyacente(destino);//se crea un nuevo nodo adyacente con el pasillo destino
        if (verticeOrigen.adyacente == null){//si el vertice origen no tiene adyacente se inicia
            verticeOrigen.adyacente = nuevo;
        } else {
            NodoAdyacente aux = verticeOrigen.adyacente;//si los tiene lo recorre hasta el ultimo
            while (aux.siguiente != null) aux = aux.siguiente;
            aux.siguiente = nuevo;//inserta el nuevo adyacente al final de la lista
        }
    }
    private NodoVertice buscarVertice(Pasillos pasillos){
        NodoVertice aux = primero;//recorre la lista de vertice desde el primero
        while (aux != null){
            if (aux.dato.getId() == pasillos.getId()) return aux;//compara el id para encontrar el vertice correcto
            aux = aux.siguiente;
        }
        return null;
    }


    @Override
    public void eliminarVertice(Pasillos pasillo) {
        if (primero != null && primero.dato.getId() == pasillo.getId()){//si el vertice a eliminar es el primero
            primero = primero.siguiente;//avanzamos al siguiente
        } else {
            NodoVertice aux = primero;//recorre la lista buscando el vertice
            while (aux != null && aux.siguiente != null){
                if (aux.siguiente.dato.getId() == pasillo.getId()){
                    aux.siguiente = aux.siguiente.siguiente;//saltea el nodo
                    break;
                }
                aux = aux.siguiente;
            }
            NodoVertice v = primero;//tambien hay que eliminar cualquier arista que apunte a este vertice
            while (v != null){
                NodoAdyacente ady = v.adyacente;
                NodoAdyacente prev = null;
                while (ady != null){
                    if (ady.dato.getId() == pasillo.getId()){
                        if (prev == null){
                            v.adyacente = ady.siguiente;//el primero de la lista
                        } else {
                            prev.siguiente = ady.siguiente;//saltea el nodo
                        }
                    }
                    prev = ady;
                    ady = ady.siguiente;
                }
                v = v.siguiente;
            }
        }

    }

    @Override
    public void eliminarArista(Pasillos origen, Pasillos destino) {
        NodoVertice verticeOrigen = buscarVertice(origen);
        if (verticeOrigen == null) return;
        NodoAdyacente ady = verticeOrigen.adyacente;
        NodoAdyacente prev = null;

        while (ady != null){
            if (ady.dato.getId() == destino.getId()){
                if (prev == null){//si es el primero de la lista de adyacentes
                    verticeOrigen.adyacente = ady.siguiente;
                } else {
                    prev.siguiente = ady.siguiente;
                }
                break;
            }
            prev = ady;
            ady = ady.siguiente;
        }
        if (!dirigido){//si no es dirigido tambien elimina la arista inversa
            NodoVertice verticeDestino = buscarVertice(destino);
            if (verticeDestino != null){
                NodoAdyacente ady2 = verticeDestino.adyacente;
                NodoAdyacente prev2 = null;
                while (ady2 != null){
                    if (ady2.dato.getId() == origen.getId()){
                        if (prev2 == null){
                            verticeDestino.adyacente = ady2.siguiente;
                        } else {
                            prev2.siguiente = ady2.siguiente;
                        }
                        break;
                    }
                    prev2 = ady2;
                    ady2 = ady2.siguiente;
                }
            }
        }

    }

    @Override
    public void mostrarGrafo() {
        NodoVertice aux = primero;
        while (aux != null){
            System.out.println(aux.dato.getNombrePasillo() + " -> ");
            NodoAdyacente ady = aux.adyacente;
            while (ady != null){
                System.out.println(ady.dato.getNombrePasillo() + " ");
                ady = ady.siguiente;
            }
            System.out.println();
            aux = aux.siguiente;
        }

    }

    @Override
    public void recorridoDFS(Pasillos inicio) {

    }

    @Override
    public void recorridoBFS(Pasillos inicio) {

    }
}
