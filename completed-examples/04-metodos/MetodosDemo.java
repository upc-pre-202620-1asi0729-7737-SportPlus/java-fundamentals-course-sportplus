import java.util.Scanner;

public class MetodosDemo {
    public static void alimentar() {
        System.out.println("Pixel fue alimentado.");
    }

    public static void main(String[] args) {
        alimentar();

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cómo se llama tu mascota? ");
        String nombreMascota = sc.nextLine();
        System.out.println("¡Genial! " + nombreMascota + " ha nacido.");
    }
}
