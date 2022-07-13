package Ejercicio2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        double price;
        double totalPrice;
        Scanner entry = new Scanner(System.in);
        System.out.println("Indicar el precio del producto\n");
        price = entry.nextDouble();
        totalPrice = calcTotalPrice(price);
        System.out.println("Precio total a pagar: " + totalPrice + " €");
    }

    static double calcTotalPrice(double price){
        return price * 1.21;
    }
}
