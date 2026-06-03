import java.util.HashSet;

public class ConjuntoCodigos {
    private HashSet<Integer> codigos;

    public ConjuntoCodigos(){
        codigos = new HashSet<>();
    }
    public void insertar(int codigo){
        codigos.add(codigo);
    }
}
