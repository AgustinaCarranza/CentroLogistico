package controller;
import TDA.DiccionarioProductos;
import TDA.GrafosPasillos;
import Model.Producto;
import Model.Pasillos;
import Service.MovimientoInventario;




public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Leche",5555,89);
        Producto prod2 = new Producto("Arroz", 9999, 123);
        Producto prod3 = new Producto("Botellas de agua",1111,6);

        //guarda los datos en el diccionario
        DiccionarioProductos diccionario = new DiccionarioProductos(10);
        diccionario.insertar(prod1.getCodigo(),prod1);
        diccionario.insertar(prod2.getCodigo(), prod2);
        diccionario.insertar(prod3.getCodigo(),prod3);

        //entrada y salida
        MovimientoInventario entrada = new MovimientoInventario(prod1,6,"entrada");
        entrada.movimiento();
        System.out.println(entrada.mostrarDetalles());

        MovimientoInventario salida = new MovimientoInventario(prod1,20,"salida");
        salida.movimiento();
        System.out.println(salida.mostrarDetalles());

        //nos permite buscar por codigo un producto si existe
        Producto buscado = diccionario.recuperar(9999);
        System.out.println("Encontrado " + buscado.getNombre());

        //muestra los productos con stock al limite
        diccionario.mostrarProductosCriticos(10);


        //crear grafo de pasillos (no dirigido)
        GrafosPasillos grafo = new GrafosPasillos(false);

        //creamos los pasillos
        Pasillos pas1 = new Pasillos(1, "Pasillo A", "Zona Norte");
        Pasillos pas2 = new Pasillos(2, "Pasillo B", "Zona Sur");
        Pasillos pas3 = new Pasillos(3, "Pasillo C", "Zona Este");
        Pasillos pas4 = new Pasillos(4, "Pasillo D", "Zona Oeste");

        //insertar vertices
        grafo.insertarVertice(pas1);
        grafo.insertarVertice(pas2);
        grafo.insertarVertice(pas3);
        grafo.insertarVertice(pas4);

        //conectar pasillos con aristas
        grafo.insertarArista(pas1, pas2);
        grafo.insertarArista(pas2, pas3);
        grafo.insertarArista(pas3, pas4);
        grafo.insertarArista(pas1, pas4);

        //muestra el grafo
        System.out.println("Grafo de pasillos:");
        grafo.mostrarGrafo();

        // recorrido DFS
        System.out.println("Recorrido DFS desde Pasillo A:");
        grafo.recorridoDFS(pas1);

        //recorrido BFS
        System.out.println("Recorrido BFS desde Pasillo A:");
        grafo.recorridoBFS(pas1);

        // eliminar una arista y mostrar de nuevo
        grafo.eliminarArista(pas1, pas4);
        System.out.println("Grafo después de eliminar arista A-D:");
        grafo.mostrarGrafo();

        // eliminar un vertice y mostrar de nuevo
        grafo.eliminarVertice(pas3);
        System.out.println("Grafo después de eliminar Pasillo C:");
        grafo.mostrarGrafo();
    }
}






