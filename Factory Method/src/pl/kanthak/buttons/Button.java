package pl.kanthak.buttons;

// Interfejs produktu deklaruje wszystkie działania które
// konkretne produkty muszą zaimplementować.
public interface Button {
    void render();
    void onClick();
}
