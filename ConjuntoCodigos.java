public class ConjuntoCodigos {
    private int[] codigos;
    private int cantidad;

    public ConjuntoCodigos(int capacidad){
        codigos = new int[capacidad];
        cantidad = 0;
    }
    public void insertar(int codigo){
        if (cantidad < codigos.length){
            codigos[cantidad] = codigo;
            cantidad++;
        }
    }
    public void eliminar(int codigo){
        for (int i = 0; i < cantidad; i++){
            if (codigos[i] == codigo){
                for (int j = i; j < cantidad - 1; j++){
                    codigos[j] = codigos[j + 1];
                }
                cantidad--;
                break;
            }
        }
    }
    public boolean pertenece(int codigo){
        for (int i = 0; i < cantidad; i++){
            if (codigos[i] == codigo){
                return true;
            }
        }
        return false;
    }
}
