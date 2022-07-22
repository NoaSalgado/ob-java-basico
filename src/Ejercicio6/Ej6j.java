package Ejercicio6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
excepciones, un HashMap y un ArrayList, LinkedList o array.
 */
public class Ej6j {
    public static void main(String[] args) {
        HashMap<String, String> frameworks = new HashMap<>();
        ArrayList<String> frontLanguages = new ArrayList<>();

        frameworks.put("Java", "Spring");
        frameworks.put("C#", ".NET");
        frameworks.put("Python", "Django");

        frontLanguages.add("HTML");
        frontLanguages.add("CSS");
        frontLanguages.add("JavaScript");

        //Escritura de los valores del HashMap y ArrayList
        try{
            PrintStream fileWrite = new PrintStream("C:\\dev-technologies.txt");

            //Escritura claves y valores del HashMap
            try{
                for (Map.Entry<String, String> entry : frameworks.entrySet()){
                    for(int i = 0; i < entry.getKey().length(); i++){
                        fileWrite.write(entry.getKey().charAt(i));
                    }
                    fileWrite.write(':');
                    fileWrite.write(' ');

                    for(int i = 0; i < entry.getValue().length(); i++){
                        fileWrite.write(entry.getValue().charAt(i));
                    }
                    fileWrite.write('\n');
                }

                fileWrite.write('\n');

                //Escritura de los valores del ArrayList
                for (String frontLanguage : frontLanguages){
                    for (int i = 0; i < frontLanguage.length(); i++){
                        fileWrite.write(frontLanguage.charAt(i));
                    }
                    fileWrite.write('\n');
                }

            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }

        }catch(IOException e){
            System.out.println("Error:"  + e.getMessage());
        }

        //Lectura del archivo creado
        try{
            InputStream fileRead = new FileInputStream("C:\\dev-technologies.txt");

            try{
                int character = fileRead.read();

                while(character != -1){
                    System.out.print((char)character);
                    character = fileRead.read();
                }

            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
