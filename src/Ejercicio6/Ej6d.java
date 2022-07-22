package Ejercicio6;

import java.util.Vector;

/*
Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
Elimina el 2o y 3er elemento y muestra el resultado final.
 */
public class Ej6d {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        numbers.remove(1);
        numbers.remove(2);

        System.out.println(numbers);
    }
}

/*
El problema de utilizar un vector con la capacidad por defecto si se van a añadir 1000 elementos,
es que internamente se realizarán múltiples copias del array subyacente, lo que tiene un alto
coste computacional
 */
