public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1985;
        boolean incluidoEnElPlan = true;
        double notasPelicula = 8.2;
        String tipoplan = "Plus";

        if(fechaDeLanzamiento > 2022){
            System.out.println("Peliculas más populares");
        }
        else{
            System.out.println("Películas que aún vale la pena ver");
        }

        if(incluidoEnElPlan || tipoplan.equals("Plus")){
            System.out.println("Disfruta el juego");
        }
        else{
            System.out.println("Juego no disponible para el plan actual");
        }
    }
}
