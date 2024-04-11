import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int cantidad = 3;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Escribe la nota que le darías al juego");
            nota = teclado.nextDouble();
            media += nota;
        }
        System.out.println("La media de evaluaciones es: "+media/cantidad);

    }
}
