class Main {
    public static void main(String[] args) {
        Jugador ana = new Jugador("Ana", 7);
        Jugador luis = new Jugador("Luis", 4);

        // Crea otro objeto Jugador y prueba su setter con 8 y con -1.
        System.out.println(ana.getNombre() + ": " + ana.getPuntaje());
        System.out.println(luis.getNombre() + ": " + luis.getPuntaje());
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
}
