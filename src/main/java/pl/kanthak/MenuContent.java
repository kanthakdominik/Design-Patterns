package pl.kanthak;

public class MenuContent {

    private final String MENU = """
            Enter the type of Patterns:
                1.Creational Patterns
                2.Behavioral Patterns
                3.Structural Patterns
                """;

    private final String CREATIONAL_SUBMENU = """
            Enter Creational Pattern:
                1.Factory Method
                2.Abstract Factory
                3.Builder
                4.Prototype
                5.Singleton
                """;

    private final String BEHAVIORAL_SUBMENU = """
            Enter Behavioral Pattern:
                1.asdf
                2.asdf
                3.asdf
                4.asdf
                5.asdf
                """;

    private final String STRUCTURAL_SUBMENU = """
            Enter Structural Pattern:
                1.asdf
                2.asdf
                3.asdf
                4.asdf
                5.asdf
                """;

    public String getMenu() {
        return MENU;
    }

    public String getCreationalSubMenu() {
        return CREATIONAL_SUBMENU;
    }

    public String getBehavioralSubMenu() {
        return BEHAVIORAL_SUBMENU;
    }

    public String getStructuralSubMenu() {
        return STRUCTURAL_SUBMENU;
    }
}
