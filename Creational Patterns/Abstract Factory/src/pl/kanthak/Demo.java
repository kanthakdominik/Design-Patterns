package pl.kanthak;

import pl.kanthak.app.Application;
import pl.kanthak.factories.GUIFactory;
import pl.kanthak.factories.MacOSFactory;
import pl.kanthak.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }


    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
