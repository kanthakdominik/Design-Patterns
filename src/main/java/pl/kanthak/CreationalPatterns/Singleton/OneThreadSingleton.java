package pl.kanthak.CreationalPatterns.Singleton;

public class OneThreadSingleton {

    private static OneThreadSingleton instance;
    public String value;

    private OneThreadSingleton(String value) {
        this.value = value;
    }

    public static OneThreadSingleton getInstance(String value) {
        if (instance == null) {
            instance = new OneThreadSingleton(value);
        }
        return instance;
    }
}
