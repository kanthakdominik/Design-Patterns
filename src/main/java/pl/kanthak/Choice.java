package pl.kanthak;

import pl.kanthak.CreationalPatterns.AbstractFactory.AbstractFactoryDemo;
import pl.kanthak.CreationalPatterns.Builder.BuilderDemo;
import pl.kanthak.CreationalPatterns.FactoryMethod.FactoryMethodDemo;
import pl.kanthak.CreationalPatterns.Prototype.PrototypeDemo;
import pl.kanthak.CreationalPatterns.Singleton.SingletonDemo;
import pl.kanthak.StructuralPatterns.Adapter.AdapterDemo;
import pl.kanthak.StructuralPatterns.Bridge.BridgeDemo;

import java.util.Scanner;

public class Choice {

    private final MenuContent menuContent = new MenuContent();
    private Pattern chosenPattern;

    public Pattern getPattern() throws Exception {
        generateMenus();
        return chosenPattern;
    }

    private void generateMenus() throws Exception {
        displayMenu();
        String patternType = getNumber();
        displaySubMenu(patternType);
        String patternNumber = getNumber();
        findPattern(patternType + patternNumber);
    }

    private void findPattern(String inputNumbers) throws Exception {
        switch (inputNumbers) {
            case "11" -> chosenPattern = new FactoryMethodDemo();
            case "12" -> chosenPattern = new AbstractFactoryDemo();
            case "13" -> chosenPattern = new BuilderDemo();
            case "14" -> chosenPattern = new PrototypeDemo();
            case "15" -> chosenPattern = new SingletonDemo();

            case "21" -> chosenPattern = new AdapterDemo();
            case "22" -> chosenPattern = new BridgeDemo();
            case "23" -> chosenPattern = new AbstractFactoryDemo();
            case "24" -> chosenPattern = new AbstractFactoryDemo();
            case "25" -> chosenPattern = new AbstractFactoryDemo();

            case "31" -> chosenPattern = new AbstractFactoryDemo();
            case "32" -> chosenPattern = new AbstractFactoryDemo();
            case "33" -> chosenPattern = new AbstractFactoryDemo();
            case "34" -> chosenPattern = new AbstractFactoryDemo();
            case "35" -> chosenPattern = new AbstractFactoryDemo();
            default -> throw new Exception("There is no such pattern");
        }
    }

    private void displayMenu() {
        System.out.println(menuContent.getMenu());
    }

    private void displaySubMenu(String patternType) throws Exception {
        switch (patternType) {
            case "1" -> System.out.println(menuContent.getCreationalSubMenu());
            case "2" -> System.out.println(menuContent.getStructuralSubMenu());
            case "3" -> System.out.println(menuContent.getBehavioralSubMenu());
            default -> throw new Exception("There is no such pattern type");
        }
    }

    private String getNumber() {
        Scanner in = new Scanner(System.in);
        return String.valueOf(in.nextInt());
    }
}
