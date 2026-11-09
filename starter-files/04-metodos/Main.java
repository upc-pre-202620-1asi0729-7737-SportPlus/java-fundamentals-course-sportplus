import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Aciertos: ");
            int aciertos = entrada.nextInt();
            System.out.print("Bono: ");
            int bono = entrada.nextInt();

            System.out.println("Puntaje: " + calcularPuntaje(aciertos, bono));
        }
    }

    static int calcularPuntaje(int aciertos, int bono) {
        // Reutiliza el cálculo de la lección 2.
        return 0;
    }
}
