package TDA;
import Model.Pasillos;

public interface IGrafoPasillos{
    void insertarVertice(Pasillos pasillo);
    boolean existeVertice(Pasillos pasillo);
    void insertarArista(Pasillos origen, Pasillos destino);
    void eliminarVertice(Pasillos pasillo);
    void eliminarArista(Pasillos origen,Pasillos destino);
    void mostrarGrafo();
    void recorridoDFS(Pasillos inicio);
    void recorridoBFS(Pasillos inicio);


}
