package TDA;

public class ConjuntoCodigos {
    private int[] codigos; //guardamos los codigos
    private int cantidad;// la cantidad de codigos

    public ConjuntoCodigos(int capacidad){
        codigos = new int[capacidad];//iniciamos el arreglo
        cantidad = 0;// no tiene codigos
    }
    public void insertar(int codigo){
        if (cantidad < codigos.length){//verificamos el espacio
            codigos[cantidad] = codigo;//si esta libre lo agregamos
            cantidad++;
        }
    }
    public void eliminar(int codigo){
        for (int i = 0; i < cantidad; i++){//recorremos el codigo
            if (codigos[i] == codigo){//cuando lo encontramos
                for (int j = i; j < cantidad - 1; j++){//movemos los otros elementos hacia atras
                    codigos[j] = codigos[j + 1];
                }
                cantidad--;
                break;//salimos del bucle
            }
        }
    }
    public boolean pertenece(int codigo){
        for (int i = 0; i < cantidad; i++){//recoremos los codidos
            if (codigos[i] == codigo){//si lo encontramos
                return true;//devolvemos true
            }
        }
        return false;// si no devuelve falso
    }
}
