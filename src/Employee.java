/* Crea una clase Employee (Empleado) para representar a un empleado de una empresa. La clase debe tener las propiedades:
    nombre, correo electrónico, edad y salario, además de sus getters y setters apropiados.

Crea una clase Intern (Practicante) que herede de la clase Employee. La clase Intern debe tener un límite de salario de 20.000 (como constante).

Implementa una validación en la clase Intern para asegurar que no se cree un practicante (o se le actualice el salario) con un salario que supere el valor máximo permitido.

Escribe un programa que cree 10 objetos Employee y que escriba todas sus propiedades (nombre, correo, edad, salario) en un archivo llamado employees.txt. */

// Clase que representa a un empleado de una empresa
public class Employee {
    // Propiedades privadas del empleado
    private String nombre;
    private String correoElectronico;
    private int edad;
    private double salario;

    // Constructor para inicializar un empleado
    public Employee(String nombre, String correoElectronico, int edad, double salario) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
        this.salario = salario;
    }

    // Getter y setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter para el correo electrónico
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // Getter y setter para la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter y setter para el salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Metodo para mostrar todos los datos del empleado como texto
    public String toString() {
        return "Nombre: " + nombre + ", Correo: " + correoElectronico +
                ", Edad: " + edad + ", Salario: " + salario;
    }
}