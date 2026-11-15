class Mascota {
    private String nombre;
    private int hambre;
    private int energia;
    private int nivel;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.hambre = 50;
        this.energia = 100;
        this.nivel = 1;
    }

    public void alimentar() {
        // TODO: Reduce el hambre en 15 sin bajar de 0.
        // Sube la energía en 5 sin superar 100 y muestra el hambre actual.
    }

    public void jugar() {
        // TODO: Reduce la energía en 10 sin bajar de 0.
        // Incrementa el nivel y muestra el nuevo valor.
    }

    public int getNivel() {
        return nivel;
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota pixel = new Mascota("Pixel");
        // TODO: Alimenta a Pixel, hazlo jugar y muestra su nivel final.
    }
}
