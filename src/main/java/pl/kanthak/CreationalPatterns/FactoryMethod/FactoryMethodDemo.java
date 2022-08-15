package pl.kanthak.CreationalPatterns.FactoryMethod;

import pl.kanthak.CreationalPatterns.FactoryMethod.factory.Dialog;
import pl.kanthak.CreationalPatterns.FactoryMethod.factory.HtmlDialog;
import pl.kanthak.CreationalPatterns.FactoryMethod.factory.WindowsDialog;
import pl.kanthak.Pattern;

public class FactoryMethodDemo implements Pattern {

    private static Dialog dialog;

    @Override
    public void process() {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    private void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
    
    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
     private void runBusinessLogic() {
        dialog.renderWindow();
    }
}
