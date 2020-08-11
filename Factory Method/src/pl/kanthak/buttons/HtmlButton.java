package pl.kanthak.buttons;

// Konkretne produkty posiadają różne implementacje interfejsu
// produktu.
public class HtmlButton implements Button {

    // Zwróć wersję HTML przycisku.
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    // Powiąż z wbudowanym w przeglądarkę zdarzeniem
    // kliknięcia
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
