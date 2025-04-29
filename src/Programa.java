import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        // Lista para guardar los empleados
        ArrayList<Employee> empleados = new ArrayList<>();

        // Agregamos 10 empleados (pueden ser Employee o Intern)
        empleados.add(new Employee("Anna López", "ana@example.com", 30, 35000));
        empleados.add(new Employee("Luis Torres", "luis@example.com", 28, 42000));
        empleados.add(new Intern("Carlos Ruiz", "carlos@example.com", 22, 18000));
        empleados.add(new Intern("Lucía Gómez", "lucia@example.com", 23, 19500));
        empleados.add(new Employee("María Pérez", "maria@example.com", 35, 50000));
        empleados.add(new Intern("José Díaz", "jose@example.com", 21, 17000));
        empleados.add(new Employee("Elena Ríos", "elena@example.com", 40, 60000));
        empleados.add(new Employee("Pedro Fernández", "pedro@example.com", 45, 70000));
        empleados.add(new Intern("Clara Morales", "clara@example.com", 23, 20000));
        empleados.add(new Employee("Andrés Silva", "andres@example.com", 38, 48000));

        // Escribimos los datos en el archivo "employees.txt"
        try (FileWriter escritor = new FileWriter("employees.txt")) {
            for (Employee emp : empleados) {
                escritor.write(emp.toString() + "\n");
            }
            System.out.println("Archivo 'employees.txt' creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
            e.printStackTrace();
        }
    }
}
