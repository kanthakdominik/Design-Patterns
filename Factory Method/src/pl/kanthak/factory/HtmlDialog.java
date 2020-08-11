package pl.kanthak.factory;

import pl.kanthak.buttons.Button;
import pl.kanthak.buttons.HtmlButton;

//Klasa konkretnego kreatora
public class HtmlDialog extends Dialog {

    // Konkretni kreatorzy nadpisują metodę wytwórczą w celu zmiany
    // zwracanego typu produktu.
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
