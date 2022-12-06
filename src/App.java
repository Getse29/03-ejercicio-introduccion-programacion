import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        persona1.setNombre(scanner.nextLine());
        System.out.println("Ingrese su edad: ");
        persona1.setEdad(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Ingrese su telefono: ");
        persona1.setTelefono(scanner.nextLine());

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Telefono: " + persona1.getTelefono());
    }
}
