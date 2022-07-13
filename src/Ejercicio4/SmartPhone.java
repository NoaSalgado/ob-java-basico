package Ejercicio4;

public class SmartPhone extends SmartDevice{
    private int cameraMpx;

    public SmartPhone(){

    }

    public SmartPhone(String maker, String model, double screenSize, int batterySize, int batteryAutonomy, int cameraMpx){
        super(maker, model, screenSize, batterySize, batteryAutonomy);
        this.cameraMpx = cameraMpx;
    }

    public int getCameraMpx(){
        return this.cameraMpx;
    }
}
