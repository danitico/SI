package Practica1;

/**
 * 
 * @author Daniel Ranchal Parrado
 */
public class ClasePrincipal {
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
}
