import java.util.Random;
import java.util.Scanner;
import java.util.random.*;;
public class EstructuraDoWhileApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        //Me dara un valor entre el uno y el diez
        int nuevoValor = (int) (Math.random() * 10 + 1);
        int elnumero = 0;
        System.out.println("Captura un número entre el 1 y 10");
        do {
            
            elnumero = sc.nextInt();
            if(elnumero > nuevoValor)
            {
                System.out.println("El número que capturate es mayor al obtenido");
                System.out.println("Vuelve a capturar el numero");
            }
            if(elnumero < nuevoValor)
            {
                System.out.println("El valor es mayor que el generado");
                System.out.println("Vuelve a capturar el numero");
            }

        } while (elnumero != nuevoValor);
        System.out.println("Lograste empatar con el valor");



    }
}
