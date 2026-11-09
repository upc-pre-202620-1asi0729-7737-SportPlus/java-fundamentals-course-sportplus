import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int cantidad = leerEntero(entrada, "¿Cuántos jugadores? (1 a 5): ", 1, 5);
            Jugador[] jugadores = new Jugador[cantidad];

            for (int i = 0; i < jugadores.length; i++) {
                System.out.println("Jugador " + (i + 1));
                String nombre = leerNombre(entrada);
                int puntaje = leerEntero(entrada, "Puntaje: ", 0, Integer.MAX_VALUE);
                jugadores[i] = new Jugador(nombre, puntaje);
            }

            System.out.println("\nResultados del torneo");
            for (int i = 0; i < jugadores.length; i++) {
                Jugador jugador = jugadores[i];
                System.out.print(jugador.getNombre() + ": " + jugador.getPuntaje() + " puntos");
                if (jugador.clasifica()) {
                    System.out.println(" - Clasificó");
                } else {
                    System.out.println(" - No clasificó");
                }
            }
        } catch (NoSuchElementException error) {
            System.out.println("\nFin de la entrada.");
        }
    }

    static int leerEntero(Scanner entrada, String mensaje, int minimo, int maximo) {
        while (true) {
            System.out.print(mensaje);
            if (!entrada.hasNextLine()) {
                throw new NoSuchElementException();
            }

            try {
                int numero = Integer.parseInt(entrada.nextLine().trim());
                if (numero >= minimo && numero <= maximo) {
                    return numero;
                }
            } catch (NumberFormatException error) {
                // Se vuelve a pedir el dato si la línea no contiene un entero válido.
            }

            System.out.println("Ingresa un número entero entre " + minimo + " y " + maximo + ".");
        }
    }

    static String leerNombre(Scanner entrada) {
        while (true) {
            System.out.print("Nombre: ");
            if (!entrada.hasNextLine()) {
                throw new NoSuchElementException();
            }

            String nombre = entrada.nextLine().trim();
            if (!nombre.isEmpty()) {
                return nombre;
            }
            System.out.println("El nombre no puede quedar vacío.");
        }
    }
}

class Jugador {
    private final String nombre;
    private int puntaje;

    Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        setPuntaje(puntaje);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        if (puntaje >= 0) {
            this.puntaje = puntaje;
        }
    }

    public boolean clasifica() {
        return puntaje >= 6;
    }
}
