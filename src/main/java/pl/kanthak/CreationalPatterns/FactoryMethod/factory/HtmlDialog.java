package pl.kanthak.CreationalPatterns.FactoryMethod.factory;


import pl.kanthak.CreationalPatterns.FactoryMethod.buttons.Button;
import pl.kanthak.CreationalPatterns.FactoryMethod.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
