package Ejercicio6;

import java.util.ArrayList;

/*
Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
A continuación, con otro bucle, recórrelo y elimina los numeros pares.
Por último, vuelve a recorrerlo y muestra el ArrayList final.
Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 */
public class Ej6f {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= 10; i++){
            numbers.add(i);
        }

        /*while(numbers.get(count) <= 10 && count < numbers.size()){
            if(numbers.get(count) % 2 == 0){
                numbers.remove(count);
            }else{
                System.out.println(numbers.get(count));
                count++;
            }
        }*/
        numbers.removeIf(number -> number % 2 == 0);

        for (Integer number: numbers){
            System.out.println(number);
        }
    }
}
