package pl.kanthak.CreationalPatterns.AbstractFactory.factories;

import pl.kanthak.CreationalPatterns.AbstractFactory.buttons.Button;
import pl.kanthak.CreationalPatterns.AbstractFactory.buttons.WindowsButton;
import pl.kanthak.CreationalPatterns.AbstractFactory.checkboxes.Checkbox;
import pl.kanthak.CreationalPatterns.AbstractFactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
