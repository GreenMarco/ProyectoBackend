import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre del juego");
        String juego = teclado.nextLine();
        System.out.println("Escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Dinos que nota le das al juego");
        double nota = teclado.nextDouble();

        System.out.println(juego);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
