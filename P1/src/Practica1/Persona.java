package Practica1;

/**
 *
 * @author Daniel Ranchal Parrado
 */
public class Persona {
    private String nombre_;
    private String apellidos_;
    private int edad_;
    
    public String getNombre(){
        return nombre_;
    }
    
    public String getApellidos(){
        return apellidos_;
    }
    
    public int getEdad(){
        return edad_;
    }
    
    public void setNombre(String nombre){
        nombre_=nombre;
    }
    
    public void setApellidos(String apellidos){
        apellidos_=apellidos;
    }
    
    public void setEdad(int edad){
        edad_=edad;
    }
   
}
