public class ElectricCar extends Car {
    public int motorPower;
    public int batteryCapacity;
    public int consumption;

    public ElectricCar(String carModel, int carStock, int manufacturyYear, int price, boolean hasFastCharging, int horsePower, int autonomy, int motorPower, int batteryCapacity, int consumption) {
        super(carModel, carStock, manufacturyYear, price, hasFastCharging, horsePower, autonomy);
        this.motorPower = motorPower;
        this.batteryCapacity = batteryCapacity;
        this.consumption = consumption;
    }

    public int getMotorPower() {
        return motorPower;
    }

    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}
