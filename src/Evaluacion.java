import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Escribe la nota que le darías al juego");
            nota = teclado.nextDouble();
            if(nota !=-1){
                media += nota;
                total++;
            }
        }

        System.out.println("La media de evaluaciones es: "+media/total);
    }
}
