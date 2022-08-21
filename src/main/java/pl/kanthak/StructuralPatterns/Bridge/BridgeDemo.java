package pl.kanthak.StructuralPatterns.Bridge;

import pl.kanthak.Pattern;
import pl.kanthak.StructuralPatterns.Bridge.devices.Device;
import pl.kanthak.StructuralPatterns.Bridge.devices.Radio;
import pl.kanthak.StructuralPatterns.Bridge.devices.Tv;
import pl.kanthak.StructuralPatterns.Bridge.remotes.AdvancedRemote;
import pl.kanthak.StructuralPatterns.Bridge.remotes.BasicRemote;

public class BridgeDemo implements Pattern {

    @Override
    public void process() {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
