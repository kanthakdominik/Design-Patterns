package pl.kanthak.CreationalPatterns.Builder;

import pl.kanthak.CreationalPatterns.Builder.builders.CarBuilder;
import pl.kanthak.CreationalPatterns.Builder.builders.CarManualBuilder;
import pl.kanthak.CreationalPatterns.Builder.components.Engine;
import pl.kanthak.CreationalPatterns.Builder.components.GPSNavigator;
import pl.kanthak.CreationalPatterns.Builder.components.Transmission;
import pl.kanthak.CreationalPatterns.Builder.components.TripComputer;
import pl.kanthak.CreationalPatterns.Builder.director.Director;
import pl.kanthak.CreationalPatterns.Builder.products.Car;
import pl.kanthak.CreationalPatterns.Builder.products.Manual;
import pl.kanthak.CreationalPatterns.Builder.products.Type;
import pl.kanthak.Pattern;

public class BuilderDemo implements Pattern {

    @Override
    public void process() {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        //Construct city car without using a director (it's not necessary)
        builder.setType(Type.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1, 70));
        builder.setTransmission(Transmission.SINGLE_SPEED);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator("Route to wroclaw"));
        car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());
    }
}
