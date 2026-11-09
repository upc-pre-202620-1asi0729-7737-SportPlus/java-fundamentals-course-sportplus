class Main {
    public static void main(String[] args) {
        int puntaje = 5;
        if (puntaje >= 6) {
            System.out.println("Clasificó");
        } else {
            System.out.println("No clasificó");
        }

        for (int ronda = 1; ronda <= 3; ronda++) {
            System.out.println("Ronda " + ronda);
        }

        int segundos = 4;
        while (segundos > 0) {
            System.out.println(segundos);
            segundos--;
        }
        System.out.println("¡Inicio!");
    }
}
