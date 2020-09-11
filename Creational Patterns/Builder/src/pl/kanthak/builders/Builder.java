package pl.kanthak.builders;

import pl.kanthak.cars.Type;
import pl.kanthak.components.Engine;
import pl.kanthak.components.GPSNavigator;
import pl.kanthak.components.Transmission;
import pl.kanthak.components.TripComputer;

public interface Builder {

    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
