package Practica1;

/**
 *
 * @author Daniel Ranchal Parrado
 */
public class Profesor extends Persona{
    private String universidad_;
    private int id_profesor_;
    
    public String getUniversidad(){
        return universidad_;
    }
    
    public int getId(){
        return id_profesor_;
    }
    
    public void setUniversidad(String universidad){
        universidad_=universidad;
    }
    
    public void setId(int id_profesor){
        id_profesor_=id_profesor;
    }
}
