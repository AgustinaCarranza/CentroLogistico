public class DiccionarioProductos {
    private int[] codigos;// arreglo de las claves(codigos)
    private Producto[] productos;
    private int cantidad;//cuantos pares clave-valor hay actualmente

    public DiccionarioProductos(int capacidad){
        codigos = new int[capacidad];
        productos = new Producto[capacidad];
        cantidad = 0;
    }
    public void insertar(int codigo, Producto p){
        if (cantidad < productos.length){//verifica si hay espacio
            codigos[cantidad] = codigo;//guarda codigo
            productos[cantidad] = p;//y producto
            cantidad++;
        }
    }
    public Producto recuperar(int codigo){//producto indica el tipo de dato que devuelve el metodo
        for (int i = 0; i < cantidad; i++){//buscamos codigo
            if (codigos[i] == codigo){//encontramos codigo
                return productos[i]; //mostramos el producto
            }
        }
        return null;// si no esta devolvemos null
    }
    public void eliminar(int codigo){
        for (int i =0; i < cantidad; i++){//recorremos los codigos
            if (codigos[i] == codigo){//si coincide
                for (int j = i; j < cantidad - 1; j++){//los movemos
                    codigos[j] = codigos[j + 1];
                    productos[j] = productos[j + 1];
                }
                cantidad--;//reducimos la cantidad
                break;//salimos del bucle
            }
        }
    }
}
