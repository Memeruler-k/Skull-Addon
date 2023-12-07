package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class PacketFlooder extends Module {
    public PacketFlooder() {
        super(Addon.CATEGORY, "Packet Flooder", "Floods the server with many packets.");
    }
}
