package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String carBody;
    private String vehicleRegNumber;
    private final int seatsAmount;
    private boolean isWinter;

    public class Key {
        private final boolean remoteIgnition;
        private final boolean nonKeyIgnition;

        public Key(boolean remoteIgnition, boolean nonKeyIgnition) {
            this.remoteIgnition = remoteIgnition;
            this.nonKeyIgnition = nonKeyIgnition;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteIgnition=" + remoteIgnition +
                    ", nonKeyIgnition=" + nonKeyIgnition +
                    '}';
        }
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String carBody, String vehicleRegNumber, int seatsAmount, boolean isWinter) {
        if (brand == null || brand.equals("") || brand.trim().equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals("") || model.trim().equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.equals("") || color.trim().equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.equals("") || country.trim().equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (transmission == null || transmission.equals("") || transmission.trim().equals("")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (carBody == null || carBody.equals("") || carBody.trim().equals("")) {
            this.carBody = "default";
        } else {
            this.carBody = carBody;
        }
        if (vehicleRegNumber == null || vehicleRegNumber.equals("") || vehicleRegNumber.trim().equals("")) {
            this.vehicleRegNumber = "default";
        } else {
            this.vehicleRegNumber = vehicleRegNumber;
        }
        if (seatsAmount <= 0) {
            this.seatsAmount = 4;
        } else {
            this.seatsAmount = seatsAmount;
        }
        this.isWinter = isWinter;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getCarBody() {
        return carBody;
    }

    public String getVehicleRegNumber() {
        return vehicleRegNumber;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public boolean isWinter() {
        return isWinter;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color == null || color.equals("") || color.trim().equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.equals("") || transmission.trim().equals("")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setVehicleRegNumber(String vehicleRegNumber) {
        if (vehicleRegNumber == null || vehicleRegNumber.equals("") || vehicleRegNumber.trim().equals("")) {
            this.vehicleRegNumber = "default";
        } else {
            this.vehicleRegNumber = vehicleRegNumber;
        }
    }

    public void setWinter(boolean winter) {
        isWinter = winter;
    }

    public void changeTires(int monthNumber) {
        if (monthNumber >= 4 && monthNumber <=10) {
            setWinter(false);
        } else {
            setWinter(true);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", carBody='" + carBody + '\'' +
                ", vehicleRegNumber='" + vehicleRegNumber + '\'' +
                ", seatsAmount=" + seatsAmount +
                ", isWinter=" + isWinter +
                '}';
    }
}
