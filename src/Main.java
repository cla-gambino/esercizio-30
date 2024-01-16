public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("1.3", "AA 000 AA", "Fiat", "Panda");
        System.out.println("la macchina è: " + myCar.getBrand() + " " + myCar.getModel() + " " + myCar.getDisplacement() + " targata: " + myCar.getPlate());
    }
}


class Car {
    String displacement, plate, brand, model;

    public Car(java.lang.String displacement, java.lang.String plate, java.lang.String brand, java.lang.String model) {
        this.displacement = displacement;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }

    public java.lang.String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(java.lang.String displacement) {
        this.displacement = displacement;
    }

    public java.lang.String getPlate() {
        return plate;
    }

    public void setPlate(java.lang.String plate) {
        this.plate = plate;
    }

    public java.lang.String getBrand() {
        return brand;
    }

    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }

    public java.lang.String getModel() {
        return model;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }
}