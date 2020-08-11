package pl.kanthak;

import pl.kanthak.factory.Dialog;
import pl.kanthak.factory.HtmlDialog;
import pl.kanthak.factory.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    // Aplikacja wybiera typ kreatora na podstawie bieżącej
    // konfiguracji lub zmiennych środowiskowych.
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    // Kod kliencki współpracuje z instancją konkretnego twórcy
    // za pośrednictwem interfejsu bazowego. Tak długo jak
    // klient będzie współpracował z kreatorem za pośrednictwem
    // interfejsu bazowego, można będzie mu przekazywać dowolną
    // podklasę twórcy.
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
