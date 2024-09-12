import java.util.Scanner;

public class RegistroPasos {

    // variables
    String name;
    String email;
    String password;
    //array
    int[] pasos = new int[5];
    int totalPasos = 0;

    // Método para registrar al usuario
    public void registroUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        name = scanner.nextLine();
        System.out.print("Ingresa tu email: ");
        email = scanner.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        password = scanner.nextLine();
    }

    // Método para iniciar sesión
    public boolean iniciarSesion(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    // Método para registrar los pasos
    public void registroPasos() {
        Scanner scanner = new Scanner(System.in);
        int dia = 0;

        while (dia < 5) {
            System.out.print("Ingrese la cantidad de pasos que realizó este día " + (dia + 1) + ": ");
            pasos[dia] = scanner.nextInt();
            totalPasos += pasos[dia];
            dia++;
        }

        // Calculo de promedio
        double promedio = (double) totalPasos / 5;

        System.out.println("\nInformación del usuario: ");
        System.out.println("Nombre: " + name);
        System.out.println("Email: " + email);
        System.out.println("\nPasos por día:");

        for (int i = 0; i < pasos.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + pasos[i] + " pasos");
        }
        System.out.println("\nPromedio de pasos en 5 días: " + promedio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistroPasos usuario = new RegistroPasos();

        // Registro de usuario
        usuario.registroUsuario();

        // Inicio de sesión
        System.out.println("Iniciar sesión");
        System.out.print("Correo: ");
        String email = scanner.nextLine();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        if (usuario.iniciarSesion(email, password)) {
            System.out.println("Has iniciado sesión exitosamente. ¡Bienvenido " + usuario.name + "!");

            // Registro de pasos
            usuario.registroPasos();

        } else {
            System.out.println("Correo o contraseña incorrectos.");
        }
    }
}
