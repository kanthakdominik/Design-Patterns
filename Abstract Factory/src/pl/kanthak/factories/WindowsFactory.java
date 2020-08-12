package pl.kanthak.factories;


import pl.kanthak.buttons.Button;
import pl.kanthak.buttons.WindowsButton;
import pl.kanthak.checkboxes.Checkbox;
import pl.kanthak.checkboxes.WindowsCheckbox;

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
