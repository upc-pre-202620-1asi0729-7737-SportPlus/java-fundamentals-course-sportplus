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
        hambre = Math.max(0, hambre - 15);
        energia = Math.min(100, energia + 5);
        System.out.println(nombre + " fue alimentado. Hambre: " + hambre);
    }

    public void jugar() {
        energia = Math.max(0, energia - 10);
        nivel++;
        System.out.println(nombre + " jugó y subió a nivel " + nivel);
    }

    public int getNivel() {
        return nivel;
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota pixel = new Mascota("Pixel");
        pixel.alimentar();
        pixel.jugar();
        System.out.println("Nivel final: " + pixel.getNivel());
    }
}
