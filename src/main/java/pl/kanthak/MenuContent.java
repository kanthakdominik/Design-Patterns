package pl.kanthak;

public class MenuContent {

    public String getMenu() {
        return """
                    Enter the type of Patterns:
                        1.Creational Patterns
                        2.Structural Patterns
                        3.Behavioral Patterns
                        """;
    }

    public String getCreationalSubMenu() {
        return """
                    Enter Creational Pattern:
                        1.Factory Method
                        2.Abstract Factory
                        3.Builder
                        4.Prototype
                        5.Singleton
                        """;
    }

    public String getStructuralSubMenu() {
        return """
                    Enter Structural Pattern:
                        1.Adapter
                        2.asdf
                        3.asdf
                        4.asdf
                        5.asdf
                        """;
    }

    public String getBehavioralSubMenu() {
        return """
                    Enter Behavioral Pattern:
                        1.asdf
                        2.asdf
                        3.asdf
                        4.asdf
                        5.asdf
                        """;
    }
}
