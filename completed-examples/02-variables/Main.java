class Main {
    public static void main(String[] args) {
        String jugador = "Ana";
        int aciertos = 3;
        int puntosPorAcierto = 2;
        int bono = 1;

        int puntaje = aciertos * puntosPorAcierto + bono;
        boolean alcanzaMeta = puntaje >= 6;

        System.out.println(jugador + " tiene " + puntaje + " puntos.");
        System.out.println("¿Alcanza la meta? " + alcanzaMeta);
    }
}
