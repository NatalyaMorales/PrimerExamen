package examen1;

public class Examen {
    
    public String palabra;
    public String vocalesM;
    public String invertida;
    public int i;
    //public boolean bandera;

    //Metodo para Primera Mayuscula
    public String primeraMayuscula (String palabra) {
    if (palabra.length()>0) {
        char primeraLetra = palabra.charAt(0);
        palabra=Character.toUpperCase(primeraLetra)+palabra.substring(1, palabra.length());
    }  
    return palabra;
    }

    //Metodo para invertir una palabra
    public String invertirCadena(String palabra){
        palabra = new StringBuilder(palabra).reverse().toString();
        return palabra;
    }

    //Metodo para Vocales en Mayuscula
    public String vocalesMayuscula(String palabra){
        palabra = palabra.replace('a','A');
        palabra = palabra.replace('e','E');
        palabra = palabra.replace('i','I');
        palabra = palabra.replace('o','O');
        palabra = palabra.replace('u','U');
        return palabra;
    }

    //Metodo para FizzBuzz
    public void fizzBuzz() {
        for(i=1;i<=100;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //Metodo para palindromo
    public boolean palindromo(String palabra){
        palabra = palabra.replaceAll(" ", "");
        palabra = palabra.toLowerCase();
        String invertida = invertirCadena(palabra);
        Boolean bandera = palabra.equals(invertida);
        return bandera;
    }
}
