package es.nexphernandez.gestion.empleado.model;
import java.util.Objects;
/**
 * @author nexphernandez
 * @version 1.0.0
 */
public abstract class Empleado {
    private String identificador;
    private String nombre;
    private int edad;
    private double salarioBase;

    /**
     * Constructor vacio
     */
    public Empleado(){}

    /**
     * Constructor con el atributo clave de la clase
     * @param identificador identificador del empleado
     */
    public Empleado(String identificador){
        this.identificador = identificador;
    }
    
    /**
     * Constructor de los atributos de la clase
     * @param identificador identificador del empleado
     * @param nombre nombre del empleado
     * @param edad edad del empleado
     * @param salarioBase salario base del empleado
     */
    public Empleado(String identificador, String nombre, 
    int edad, double salarioBase){
        this.identificador = identificador;
        this.edad = edad;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Funcion para calcular el salario
     * @return el salario
     */
    public abstract double calcularSalarioFinal();

    /**
     * Funcion para mostrar la informacion de un empleado
     * @param empleado empleado del cual mostrar la informacion
     * @return toString del empleado
     */
    public String mostrarInformacio(Empleado empleado){
        return empleado.toString();
    }

    /**
     * Funcion toString de la clase
     */
    @Override
    public String toString() {
        return "{" +
            " identificador='" + getIdentificador() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", salarioBase='" + getSalarioBase() + "'" +
            "}";
    }

    /**
     * Funcion equals de la clase
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(identificador, empleado.identificador);
    }

    /**
     * Funcion hashCode de la clase
     */
    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

}
