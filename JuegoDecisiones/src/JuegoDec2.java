import java.util.Scanner;
public class JuegoDec2 {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        String nombre= "";
        int dec1;

        System.out.println("Nombre del Jugador: " + nombre);
        nombre= entrada.nextLine();

        System.out.println("Bienvenido " + nombre);
        System.out.println("");
        System.out.println("Era una tarde tranquila en CU, acabas de salir de clases, desde la mañana no hablas con a tu novia");
        System.out.println("Que haces?");
        System.out.println("1. Ir a verla de sorpresa a la Facultad de Medicina donde estudia");
        System.out.println("2. Esperar a que ella te mande mensaje");
        dec1= entrada.nextInt();
        if (dec1 == 1){
            System.out.println("Al llegar a su Facultad sus amigos te dicen que la ultima vez que la vieron fue cuando entro al Laboratorio de practicas");
            System.out.println("Qué haces?");
            System.out.println("1. ");
        } else if (dec1 == 2) {
            System.out.println("Dieron las 8 de la noche (Hora de que acaban tus clases) y no te mando mensaje");
            System.out.println("Qué haces?");
        }
    }
}
