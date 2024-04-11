import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvendio a Hall of Game");
        System.out.println("Juego: Super Mario Bros");

        int fechaDeLanzamiento = 1985;
        boolean incluidoEnElPlan = true;
        double notasPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Super Mario es un fontanero que salva
                un videojuego importante en su momento
                fue lanzado en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    }
}