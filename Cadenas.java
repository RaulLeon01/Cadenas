import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        /*
        //Crear un objeto que escanea el nombre del usuario ingresado desde teclado
        Scanner almacenar = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = almacenar.nextLine(); //Alamacena cadenas (nexLine)
        System.out.println("El nombre es: " + nombre); //Imprime el nombre ingresado por el usuario
        */

        //NUEVO CODIGO, PEDIR NOMBRE Y APELLIDO Y LOS IMPRIME
        Scanner almacenarNombre = new Scanner(System.in);
        System.out.print("Escribe nombre(s): ");
        String nombre = almacenarNombre.nextLine();

        System.out.print("Escribe apellido(s): ");
        String apellidos = almacenarNombre.nextLine();

        System.out.println("Nombre completo: " + nombre + " " + apellidos);
    }
}