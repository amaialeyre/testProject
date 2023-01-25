package lesson5task5;

public class MotorVehicle extends Vehicle {

    private boolean engineStarted;

    public MotorVehicle(String nameOfVehicle) {
        super(nameOfVehicle);
    }

    protected void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    protected void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }
}
