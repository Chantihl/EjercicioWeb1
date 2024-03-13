package ejercicios;

import java.util.Scanner;

public class EjercicioInicioSesion {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú principal
        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarse();
                    break;
                case 2:
                    iniciarSesion();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void registrarse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Celular: ");
        String celular = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.println("Registro exitoso. ¡Bienvenido " + nombre + "!");
    }

    private static void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        System.out.println("Iniciar Sesión");

        while (intentos > 0) {
            System.out.print("Correo o Celular: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contraseña = scanner.nextLine();


            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");

            intentos--;

            if (intentos > 0) {
                System.out.println("Intentos restantes: " + intentos);
            }
        }

        System.out.println("Perfil bloqueado");

    }

    private static void calculoimc() {
        Scanner sc = new Scanner(System.in);
        // IMC = < 18        -> Bajo peso
        // IMC = <= 18 > 25   -> Peso normal
        // IMC = <= 25 > 30  -> Sobrepeso
        // IMC = <= 30       -> Obesidad

        System.out.println("Ingrese su peso");
        double peso = sc.nextDouble();

        System.out.println("Ingrese su estatura");
        double estatura = sc.nextDouble();

        double imc = Math.round(peso / (estatura * estatura));

        System.out.println(imc);

        if (imc < 18) {
            System.out.println("Su IMC corresponde a bajo peso");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Su IMC corresponde a peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Su IMC corresponde a sobrepeso");
        } else {
            System.out.println("Su IMC corresponde a obesidad");
        }
    }
    public static void recomendaciones(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Recomendaciones IMC = bajo peso
        //2. Recomendaciones IMC = peso normal
        //3. Recomendaciones IMC = sobrepeso
        //4. Recomendaciones IMC = obesidad

        System.out.println("Seleccione:\n" +
                "1. bajo peso \n" +
                "2. peso normal \n" +
                "3. sobrepeso \n" +
                "4. obesidad");

        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("Recomendaciones medicas para aumentar el IMC");
                break;
            case 2:
                System.out.println("Recomendaciones medicas para mantener el IMC");
                break;
            case 3:
                System.out.println("Recomendaciones para mejorar el IMC");
                break;
            case 4:
                System.out.println("Recomendaciones para bajar el IMC");
                break;
            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
}
}

















