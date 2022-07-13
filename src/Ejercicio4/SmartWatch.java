package Ejercicio4;

public class SmartWatch extends SmartDevice{
    private String watchBand;

    public SmartWatch(){

    }

    public SmartWatch(String maker, String model, double screenSize, int batterySize, int batteryAutonomy, String watchBand) {
        super(maker, model, screenSize, batterySize, batteryAutonomy);
        this.watchBand = watchBand;
    }

    public String getWatchBand() {
        return watchBand;
    }
}
