package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class CustomPackets extends Module {
    public CustomPackets() {
        super(Addon.CATEGORY, "Custom Packets", "Use or send Custom Packets");
    }
}
