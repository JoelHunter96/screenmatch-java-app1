import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hola mundo");
        //System.out.println("App de la pelicula: Matrix");

        int fechaDeLanzamiento= 1999;
        double evaluacion = 4.5;
        boolean inclucidoEnElPlanBasico = true;

        String nombre = "Matrix";

        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula" + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(inclucidoEnElPlanBasico);

        double mediaevaluativa = Math.ceil((4.5 + 5 + 3) /3);
        System.out.println("Evaluacio: " + mediaevaluativa);

        if(fechaDeLanzamiento >= 2023){
            System.out.println("La pelicula Popular del Momento");

        }else{
            System.out.println("La pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese La Nota Que le Darias a Matrix");

            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;



        }
        System.out.println("La Media Evaluativa es: " +
                "Matrix Calculada por el Usuario:" + mediaEvaluacionUsuario / 3 );

        }
    }
