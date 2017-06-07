package ro.siit.carrental.domain;

/**
 * Created by Florina Szasz on 6/7/2017.
 */
public class Car {

        // the object characteristics

        private String make; // producer
        private String model;
        private String fuelType;
        private String colour;
        private String audioSystemType;
        private int producingYear;
        private int maxSpeed;
        private int noOfSpeeds;
        private double carLength; // in meters
        private double carHight;  // in meters
        private double carWidth;  // in meters
        private int bootCapacity; // in liters
        private boolean gps;
        private boolean airCondition;
        private boolean airBags;
        private boolean smartBoard;

        // the car constructor with all characteristics

        public Car(String make, String model, String fuelType, String colour, String audioSystemType,
                   int producingYear, int maxSpeed, int noOfSpeeds, double carLength, double carHight,
                   double carWidth, int bootCapacity, boolean gps, boolean airCondition, boolean airBags,
                   boolean smartBoard) {
            this.make = make;
            this.model = model;
            this.fuelType = fuelType;
            this.colour = colour;
            this.audioSystemType = audioSystemType;
            this.producingYear = producingYear;
            this.maxSpeed = maxSpeed;
            this.noOfSpeeds = noOfSpeeds;
            this.carLength = carLength;
            this.carHight = carHight;
            this.carWidth = carWidth;
            this.bootCapacity = bootCapacity;
            this.gps = gps;
            this.airCondition = airCondition;
            this.airBags = airBags;
            this.smartBoard = smartBoard;
        }

        // the getters for all characteristics

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public String getFuelType() {
            return fuelType;
        }

        public String getColour() {
            return colour;
        }

        public String getAudioSystemType() {
            return audioSystemType;
        }

        public int getProducingYear() {
            return producingYear;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public int getNoOfSpeeds() {
            return noOfSpeeds;
        }

        public double getCarLength() {
            return carLength;
        }

        public double getCarHight() {
            return carHight;
        }

        public double getCarWidth() {
            return carWidth;
        }

        public int getBootCapacity() {
            return bootCapacity;
        }

        public boolean hasGps() {
            return gps;
        }

        public boolean hasAirCondition() {
            return airCondition;
        }

        public boolean hasAirBags() {
            return airBags;
        }

        public boolean hasSmartBoard() {
            return smartBoard;
        }

        // the setters for some characteristics, the ones I thought need a setter

        public void setColour(String colour) {
            this.colour = colour;
        }

        public void setAudioSystemType(String audioSystemType) {
            this.audioSystemType = audioSystemType;
        }

        public void setGps(boolean gps) {
            this.gps = gps;
        }

        public void setAirCondition(boolean airCondition) {
            this.airCondition = airCondition;
        }

        public void setAirBags(boolean airBags) {
            this.airBags = airBags;
        }

        public void setSmartBoard(boolean smartBoard) {
            this.smartBoard = smartBoard;
        }
}
