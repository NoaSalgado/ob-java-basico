package Ejercicio4;
/*
Crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
Agregar atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crear objetos de cada una y los utilizarlos para imprimir sus valores por consola.
 */
public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Apple", "iPhone", 6.5, 7000, 9, 48);
        SmartWatch watch = new SmartWatch("Apple", "Apple Watch", 1.5, 1000, 24,"Sport" );

        System.out.println("Fabricante: " + phone.getMaker() +
                "\nModelo: " + phone.getModel() +
                "\nTamaño pantalla: " + phone.getScreenSize() +
                "\nBatería: " + phone.getBatterySize() +
                "\nAutonomía: " + phone.getBatteryAutonomy() +
                "\nCámara: " + phone.getCameraMpx());

        System.out.println();

        System.out.println("Fabricante: " + watch.getMaker() +
                "\nModelo: " + watch.getModel() +
                "\nTamaño pantalla: " + watch.getScreenSize() +
                "\nBatería: " + watch.getBatterySize() +
                "\nAutonomía: " + watch.getBatteryAutonomy() +
                "\nCorrea: " + watch.getWatchBand());
    }
}
