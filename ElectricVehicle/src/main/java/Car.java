import java.util.List;

public class Car extends Dealer {

    public String carModel;
    public int carStock;
    public int manufacturyYear;
    public int price;
    public boolean hasFastCharging;
    public int horsePower;
    public int autonomy;

    public Car(String carModel, int carStock, int manufacturyYear, int price, boolean hasFastCharging, int horsePower, int autonomy) {
        this.carModel = carModel;
        this.carStock = carStock;
        this.manufacturyYear = manufacturyYear;
        this.price = price;
        this.hasFastCharging = hasFastCharging;
        this.horsePower = horsePower;
        this.autonomy = autonomy;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarStock() {
        return carStock;
    }

    public void setCarStock(int carStock) {
        this.carStock = carStock;
    }

    public int getManufacturyYear() {
        return manufacturyYear;
    }

    public void setManufacturyYear(int manufacturyYear) {
        this.manufacturyYear = manufacturyYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHasFastCharging() {
        return hasFastCharging;
    }

    public void setHasFastCharging(boolean hasFastCharging) {
        this.hasFastCharging = hasFastCharging;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }



}
