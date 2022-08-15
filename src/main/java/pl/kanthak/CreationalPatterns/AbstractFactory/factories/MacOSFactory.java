package pl.kanthak.CreationalPatterns.AbstractFactory.factories;

import pl.kanthak.CreationalPatterns.AbstractFactory.buttons.Button;
import pl.kanthak.CreationalPatterns.AbstractFactory.buttons.MacOSButton;
import pl.kanthak.CreationalPatterns.AbstractFactory.checkboxes.Checkbox;
import pl.kanthak.CreationalPatterns.AbstractFactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
