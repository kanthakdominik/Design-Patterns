package pl.kanthak.CreationalPatterns.AbstractFactory;

import pl.kanthak.CreationalPatterns.AbstractFactory.app.Application;
import pl.kanthak.CreationalPatterns.AbstractFactory.factories.GUIFactory;
import pl.kanthak.CreationalPatterns.AbstractFactory.factories.MacOSFactory;
import pl.kanthak.CreationalPatterns.AbstractFactory.factories.WindowsFactory;
import pl.kanthak.Pattern;

/**
 * Demo class. Everything comes together here.
 */
public class AbstractFactoryDemo implements Pattern {

    String OS_NAME = System.getProperty("os.name").toLowerCase();


    @Override
    public void process() {
        Application app = configureApplication();
        app.paint();
    }


    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private Application configureApplication() {
        GUIFactory factory;

        if (OS_NAME.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }
}
