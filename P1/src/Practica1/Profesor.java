package Practica1;

/**
 *
 * @author Daniel Ranchal Parrado
 */
public class Profesor extends Persona{
    private String universidad_;
    private int id_profesor_;
    
    public static void main(String[] args){
        Operaciones operaciones = new Operaciones();
        Profesor profesor = new Profesor();
        
        System.out.println("El factorial de 5 es " + operaciones.Factorial(5));
        
        profesor.setNombre("Pedro");
        profesor.setApellidos("Gómez López");
        profesor.setEdad(40);
        profesor.setUniversidad("Universidad de Córdoba");
        profesor.setId(231655);
        
        System.out.println("El profesor " + profesor.getNombre() + " " + 
                            profesor.getApellidos() + " con edad " + 
                            profesor.getEdad() + " trabaja en la universidad " + 
                            profesor.getUniversidad() + " y tiene un id de profesor " + 
                            profesor.getId() + ".");
    }
    
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
