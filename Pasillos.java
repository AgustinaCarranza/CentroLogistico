package Model;

public class Pasillos {
    private int id;
    private String nombrePasillo;//ej: pasillo1
    private String ubicacion;

    public Pasillos(int id,String nombrePasillo,String ubicacion){
        this.id = id;
        this.nombrePasillo = nombrePasillo;
        this.ubicacion = ubicacion;
    }
    //getters
    public int getId(){ return id; }
    public String getNombrePasillo(){return nombrePasillo; }
    public String getUbicacion(){return ubicacion; }


}
