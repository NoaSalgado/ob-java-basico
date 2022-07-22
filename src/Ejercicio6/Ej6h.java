package Ejercicio6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/*
Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado
en "fileOut".
 */
public class Ej6h {
    public static void main(String[] args) {
        try{
            InputStream fileIn = new FileInputStream("C:\\prueba.txt");
            PrintStream fileOut = new PrintStream("C:\\copia.txt");
            try{
                copyFile(fileIn, fileOut);
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void copyFile(InputStream filein, PrintStream fileout) throws IOException {
        int character = filein.read();
        while(character != -1){
            fileout.write((char)character);
            character = filein.read();
        }
    }
}
