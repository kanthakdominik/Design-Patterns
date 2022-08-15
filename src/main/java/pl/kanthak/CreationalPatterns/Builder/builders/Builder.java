package pl.kanthak.CreationalPatterns.Builder.builders;

import pl.kanthak.CreationalPatterns.Builder.products.Type;
import pl.kanthak.CreationalPatterns.Builder.components.Engine;
import pl.kanthak.CreationalPatterns.Builder.components.GPSNavigator;
import pl.kanthak.CreationalPatterns.Builder.components.Transmission;
import pl.kanthak.CreationalPatterns.Builder.components.TripComputer;

public interface Builder {

    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
