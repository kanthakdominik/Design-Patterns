package pl.kanthak.factory;

import pl.kanthak.buttons.Button;
import pl.kanthak.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
