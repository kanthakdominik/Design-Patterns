package pl.kanthak.factory;

import pl.kanthak.buttons.Button;

// Klasa kreacyjna (kreator) deklaruje metodę wytwórczą która musi zwracać
// obiekt klasy produktu. Poszczególne podklasy kreatora na ogół
// implementują tę metodę.
public abstract class Dialog {


    // Zwróć uwagę, że pomimo swojej nazwy, głównym zadaniem
    // kreatora nie jest tworzenie produktów. Zamiast tego
    // zawiera jakąś kluczową logikę biznesową która jest
    // zależna od obiektów-produktów zwróconych przez metodę
    // wytwórczą. Podklasy mogą pośrednio zmieniać tę logikę
    // biznesową poprzez nadpisywanie metody wytwórczej i
    // zwracanie innych typów produktów.
    public void renderWindow() {

        // Wywołanie metody wytwórczej w celu stworzenia
        // obiektu-produktu.
        Button okButton = createButton();

        // A następnie użycie produktu.
        okButton.render();
    }

    // Kreator może również posiadać jakąś domyślną
    // implementację metody wytwórczej.
    public abstract Button createButton();
}
