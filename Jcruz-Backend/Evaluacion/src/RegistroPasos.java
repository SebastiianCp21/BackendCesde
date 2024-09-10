import java.util.Scanner;

public class RegistroPasos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registro del usuario
        System.out.print("Ingresa tu nombre de usuario: ");
        String name = scanner.nextLine();
        System.out.print("Ingresa tu email: ");
        String email = scanner.nextLine();
        System.out.print("Ingresa tu contraseña: ");
        String password = scanner.nextLine();

        //array con 5 elementos(dias)
        int[] pasos = new int[5];
        int totalPasos = 0;
        int dia = 0;

        while (dia < 5) {
            System.out.print("Ingrese la cantidad de pasos que realizó este día " + (dia + 1) + ": ");
            pasos[dia] = scanner.nextInt();
            totalPasos += pasos[dia];
            dia++;
        }
        //calculo de promedio
        double promedio = (double) totalPasos / 5;

        System.out.println("\nInformacion del usuario: ");
        System.out.println("Nombre: " + name);
        System.out.println("Email: " + email);
        System.out.println("\nPasos por día:");

        for (int i = 0; i < pasos.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + pasos[i] + " pasos");
        }
        System.out.println("\nPromedio de pasos en 5 días: " + promedio);
    }
}
