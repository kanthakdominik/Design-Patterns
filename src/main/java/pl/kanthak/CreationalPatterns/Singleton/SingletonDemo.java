package pl.kanthak.CreationalPatterns.Singleton;

import pl.kanthak.Pattern;

public class SingletonDemo implements Pattern {

    @Override
    public void process() {
        DemoSingleThread.runDemo();
        DemoMultiThread.runDemo();
    }
}
