package pl.kanthak.factory;

import pl.kanthak.buttons.Button;
import pl.kanthak.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
