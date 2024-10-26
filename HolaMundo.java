import java.util.Scanner;

public class HolaMundo{

    public static void main(String[] args){
        System.out.println("Hola Mundo");
        System.out.printf("Aquí va una cadena: %s%n", "Mauricio");
        System.out.printf("Mi nombre es %s y tengo años %d%n", "Mauricio Ceballos", 43);

        var entrada = new Scanner(System.in);
        
        System.out.print("Escriba un entero: ");
        int entero = entrada.nextInt();

        entrada.close();


    }

}