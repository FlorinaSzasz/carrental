package ro.siit.carrental;

import ro.siit.carrental.domain.Car;
/**
 * Created by Florina Szasz on 6/7/2017.
 */
public class Main {
    public static void main(String[] args) {
        Car LexusGS1 = new Car("Lexus", "Lexus GS", "Diesel oil", "Indigo Blue",
                "MARK LEVINSON PREMIUM SURROUND SOUND AUDIO SYSTEM", 2016,
                100, 7, 4.88, 1.46, 1.84, 450,
                false, false, false, false);
        Car LexusRC1 = new Car("Lexus", "Lexus RC", "Petrol", "Red",
                "MARK LEVINSON PREMIUM SURROUND SOUND AUDIO SYSTEM", 2015,
                250, 8, 4.70, 1.40, 1.84, 366,
                false, false, true, false);
        Car LexusRX1 = new Car("Lexus", "Lexus RX 350", "Diesel oil", "Black",
                "MARK LEVINSON PREMIUM SURROUND SOUND AUDIO SYSTEM", 2014,
                150, 7, 4.89, 1.69, 1.90, 539,
                false, false, true, true);
        Car MaseratiGhibli1 = new Car("Maserati", "Maserati Ghibli", "Diesel oil",
                "Grey", "8-speakers (280W) audio sound system", 2016,
                200, 8, 4.97, 1.46, 1.95, 500,
                false, true, true, true);
        Car MaseratiGranCabrioSport1 = new Car("Maserati", "Maserati GranCabrio Sport",
                "Petrol", "Dark Red", "8-speakers (280W) audio sound system",
                2015, 250, 9, 4.88, 1.36, 1.92,
                173, true, false, true, true);
        Car TeslaModelS60D1 = new Car("Tesla", "Tesla Model S 60D 4dr Sedan", "Electric",
                "Dark Indigo Blue", "Tesla 7 Speakers 200 Watts Stereo Output",
                2016, 150, 7, 4.97, 1.45, 1.97,
                895, true, true, true, true);

        System.out.println(LexusGS1.getMake() + " , " + LexusGS1.getModel() + " , " + LexusGS1.getProducingYear() + "\n");
    }
}