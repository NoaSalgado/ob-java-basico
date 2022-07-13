package Ejercicio3;

public class Ej3 {
    /*Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
    Los textos pueden venir de un array de tipo String. Por ejemplo:
    String[] nombres = {"", "", "", ""}*/
    public static void main(String[] args) {
        String[] names = {"Laura", "María", "Javier", "Sergio"};
        String namesList = "";

        for (int i = 0; i < names.length; i++){
            if(i == names.length -1){
                namesList += names[i];
            }else{
                namesList += names[i] + ", ";
            }
        }
        System.out.println("La lista de nombes es: " + namesList);
    }
}
