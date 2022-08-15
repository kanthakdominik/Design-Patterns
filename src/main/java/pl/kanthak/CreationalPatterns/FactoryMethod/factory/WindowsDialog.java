package pl.kanthak.CreationalPatterns.FactoryMethod.factory;


import pl.kanthak.CreationalPatterns.FactoryMethod.buttons.Button;
import pl.kanthak.CreationalPatterns.FactoryMethod.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
