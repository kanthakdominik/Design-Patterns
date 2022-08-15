package pl.kanthak.CreationalPatterns.AbstractFactory.app;

import pl.kanthak.CreationalPatterns.AbstractFactory.buttons.Button;
import pl.kanthak.CreationalPatterns.AbstractFactory.checkboxes.Checkbox;
import pl.kanthak.CreationalPatterns.AbstractFactory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
