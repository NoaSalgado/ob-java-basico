package Ejercicio6;
/*
Dada la función:
 public static String reverse(String texto) { }
Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 */
public class Ej6a {
    public static void main(String[] args) {
        String text = "Hello world";
        System.out.println(reverse(text));
    }

    public static String reverse(String text){
        String textReversed = "";

        for(int i = text.length()-1; i >=0; i--){
            textReversed += text.charAt(i);
        }
        return textReversed;
    }
}
