public class ControlDemo {
    public static void main(String[] args) {
        int hambre = 80;

        if (hambre > 70) {
            System.out.println("¡Pixel tiene mucha hambre!");
        } else {
            System.out.println("Pixel está bien de hambre.");
        }

        for (int dia = 1; dia <= 5; dia++) {
            System.out.println("Día " + dia + ": cuidando a Pixel");
        }
    }
}
