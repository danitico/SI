package Practica1;

/**
 *
 * @author Daniel Ranchal Parrado
 */
public class Operaciones {
    public int Factorial(int number){
        if(number == 0 || number == 1 ){
            return 1;
        }
        else{
            int resultado=1;
            for (int i=number; i > 1; i--) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
