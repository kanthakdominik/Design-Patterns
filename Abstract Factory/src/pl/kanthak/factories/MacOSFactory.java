package pl.kanthak.factories;

import pl.kanthak.buttons.Button;
import pl.kanthak.buttons.MacOSButton;
import pl.kanthak.checkboxes.Checkbox;
import pl.kanthak.checkboxes.MacOSCheckbox;

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
