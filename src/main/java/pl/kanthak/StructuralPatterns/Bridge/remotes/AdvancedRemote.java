package pl.kanthak.StructuralPatterns.Bridge.remotes;

import pl.kanthak.StructuralPatterns.Bridge.devices.Device;

public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}