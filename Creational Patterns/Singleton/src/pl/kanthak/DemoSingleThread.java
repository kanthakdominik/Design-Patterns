package pl.kanthak;

public class DemoSingleThread {

    public static void runDemo(){
        System.out.println("If you see the same values, it means that the program created only one singleton object");
        OneThreadSingleton singleton = OneThreadSingleton.getInstance("s1");
        OneThreadSingleton anotherSingleton = OneThreadSingleton.getInstance("s2");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
