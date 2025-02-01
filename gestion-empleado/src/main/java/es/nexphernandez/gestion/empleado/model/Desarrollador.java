package es.nexphernandez.gestion.empleado.model;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public class Desarrollador extends Empleado{

    /**
     * Constructor vacio
     */
    public Desarrollador(){}

    /**
     * Constructor de los atributos de la clase
     * @param identificador identificador del empleado
     * @param nombre nombre del empleado
     * @param edad edad del empleado
     * @param salarioBase salario base del empleado
     */
    public Desarrollador(String identificador,String nombre, int edad, double salarioBase){
        super(identificador, nombre, edad, salarioBase);
    }

    /**
     * Funcion para calcular el salario
     * @return el salario
     */
    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + getSalarioBase() * 0.2;
    }
    
}
