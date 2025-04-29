// Clase Intern (Practicante) que hereda de Employee
public class Intern extends Employee {
    // Constante: salario máximo permitido para un practicante
    private static final double SALARIO_MAXIMO = 20000;

    // Constructor para crear un practicante
    public Intern(String nombre, String correoElectronico, int edad, double salario) {
        // Si el salario es mayor al máximo permitido, mostramos un error y lanzamos excepción
        super(nombre, correoElectronico, edad, validarSalario(salario));
    }

    // Metodo privado para validar el salario al crear el objeto
    private static double validarSalario(double salario) {
        if (salario > SALARIO_MAXIMO) {
            throw new IllegalArgumentException("Error: El salario de un practicante no puede superar " + SALARIO_MAXIMO);
        }
        return salario;
    }

    // Sobrescribimos el setter para evitar que se actualice con un salario inválido
    @Override
    public void setSalario(double salario) {
        if (salario > SALARIO_MAXIMO) {
            System.out.println("Error: No se puede asignar un salario mayor a " + SALARIO_MAXIMO + " a un practicante.");
        } else {
            super.setSalario(salario);
        }
    }

    // Metodo para mostrar los datos del practicante
    @Override
    public String toString() {
        return "Practicante - " + super.toString();
    }
}
