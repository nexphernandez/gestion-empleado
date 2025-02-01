package es.nexphernandez.gestion.empleado.model;

/*
 * @author nexphernandez
 * @version 1.0.0
 */
public class Programa {
    public static void main(String[] args) {
        Empleado desarrollador = new Desarrollador("D001", "Carlos", 25, 3000.0);
        Empleado diseñador = new Diseniador("D002", "Ana", 30, 2500.0);
        Empleado gerente = new Gerente("G003", "Luis", 25, 5000.0);

        System.out.println("Empleado: Desarrollador");
        System.out.println(desarrollador);
        System.out.println("Salario Final: " + desarrollador.calcularSalarioFinal());
        System.out.println();

        System.out.println("Empleado: Diseñador");
        System.out.println(diseñador);
        System.out.println("Salario Final: " + diseñador.calcularSalarioFinal());
        System.out.println();

        System.out.println("Empleado: Gerente");
        System.out.println(gerente);
        System.out.println("Salario Final: " + gerente.calcularSalarioFinal());
    }
    
}
