public class Car extends Dealer {
    public String carModel;
    public int carStock;
    public int manufacturyYear;
    public int price;

    public Car(String carModel, int carStock, int manufacturyYear, int price) {
        this.carModel = carModel;
        this.carStock = carStock;
        this.manufacturyYear = manufacturyYear;
        this.price = price;
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
}
