package examen1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("\nExamen del primer parcial \n1. Priemera Mayúscula\n2. Invertir Cadena\n3. Vocales en mayúscula\n4. FizzBuzz\n5. Palindromo");
        System.out.println("\nIngrese el numero de la opcion que desea realizar:");
        int op = sc.nextInt();
        sc.nextLine();
        Examen examen = new Examen();

        switch (op) {
            case 1: 
            System.out.println("\nIngrese una palabra:");
            String palabra1 = sc.nextLine();
            String miPalabra1 = examen.primeraMayuscula(palabra1);
            System.out.println("\nPalabra con primera letra en mayuscula: " +miPalabra1);
            break;

            case 2:
            System.out.println("\nIngrese una palabra:");
            String palabra2 = sc.nextLine();
            String miPalabra2 = examen.invertirCadena(palabra2);
            System.out.println("\nPalabra invertida: " +miPalabra2);
            break;
            
            case 3:
            System.out.println("\nIngrese una palabra:");
            String palabra3 = sc.nextLine();
            String miPalabra3 = examen.vocalesMayuscula(palabra3);
            System.out.println("\nPalabra con vocales en mayuscula: " +miPalabra3);
            break;

            case 4:
            System.out.println("\nSerie FizzBuzz:");
            examen.fizzBuzz();
            break;

            case 5:
            System.out.println("\nIngrese una palabra:");
            String palabra5 = sc.nextLine();
            boolean bandera = examen.palindromo(palabra5);
            if (bandera == true) { 
                System.out.println("\nLa palabra es un palindromo");
            } else 
                System.out.println("\nLa palabra no es un palindromo");
            break;
        }
        
        sc.close();
    }
}
