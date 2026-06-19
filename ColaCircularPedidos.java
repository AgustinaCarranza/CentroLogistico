package TDA;

import Model.Pedido;

public class ColaCircularPedidos {

    private Pedido[] cola;
    private int frente;
    private int fin;
    private int cantidad;

    public ColaCircularPedidos(int capacidad) {
        cola = new Pedido[capacidad];
        frente = 0;
        fin = -1;
        cantidad = 0;
    }

    public void encolar(Pedido pedido) {
        if (cantidad < cola.length) {
            fin = (fin + 1) % cola.length;
            cola[fin] = pedido;
            cantidad++;
        }
    }

    public Pedido desencolar() {
        if (cantidad > 0) {
            Pedido pedido = cola[frente];
            frente = (frente + 1) % cola.length;
            cantidad--;
            return pedido;
        }
        return null;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public void mostrarPedidos() {

        if (estaVacia()) {
            System.out.println("No hay pedidos pendientes");
            return;
        }

        int i = frente;

        for (int contador = 0; contador < cantidad; contador++) {
            cola[i].mostrarPedido();
            i = (i + 1) % cola.length;
        }
    }
}
