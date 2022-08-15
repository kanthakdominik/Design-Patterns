package pl.kanthak;

public class Main {

    public static void main(String[] args) throws Exception {
        Choice choice = new Choice();
        Pattern pattern;

        while (true) {
            pattern = choice.getPattern();
            pattern.process();
        }
    }
}
