class Main {
    public static void main(String[] args) {
        int puntaje = 7;
        if (puntaje >= 6) {
            System.out.println("Clasificó");
        } else {
            System.out.println("No clasificó");
        }

        for (int ronda = 1; ronda <= 3; ronda++) {
            System.out.println("Ronda " + ronda);
        }

        int segundos = 3;
        // Crea un bucle while que muestre los segundos y los reduzca de uno en uno.
        System.out.println("¡Inicio!");
    }
}
