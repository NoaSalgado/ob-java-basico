package Ejercicio6;

import java.util.ArrayList;
import java.util.LinkedList;

/*
Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
Recorre ambos mostrando únicamente el valor de cada elemento.
 */
public class Ej6e {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);

        for (Integer number: numbersList){
            System.out.println(number);
        }

        System.out.println();

        LinkedList<Integer> numbersLinkedList = new LinkedList<>(numbersList);

        for (Integer number: numbersLinkedList){
            System.out.println(number);
        }
    }
}
