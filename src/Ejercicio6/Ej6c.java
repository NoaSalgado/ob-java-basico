package Ejercicio6;

/*
Crea un array bidimensional de enteros y recórrelo,
mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */
public class Ej6c {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}, {10, 11, 12}};

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[0].length; j++){
                System.out.println("Posición: " + i + " - " + j + " Número: " + numbers[i][j]);
            }
        }
    }
}
