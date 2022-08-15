package pl.kanthak.CreationalPatterns.Singleton;

public class DemoMultiThread {

    public static void runDemo(){
        System.out.println("If you see the same values, it means that the program created only one singleton object");
        System.out.println("Thread-safe singleton is working properly");
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("s1");
            System.out.println(singleton.value);
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("s2");
            System.out.println(singleton.value);
        }
    }
}
