package pl.kanthak.factories;

import pl.kanthak.buttons.Button;
import pl.kanthak.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
