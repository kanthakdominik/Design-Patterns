package pl.kanthak.CreationalPatterns.AbstractFactory.factories;

import pl.kanthak.CreationalPatterns.AbstractFactory.buttons.Button;
import pl.kanthak.CreationalPatterns.AbstractFactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
