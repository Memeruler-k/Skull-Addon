package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class PacketCrash extends Module {
    public PacketCrash() {
        super(Addon.CATEGORY, "Packet Crash V2", "Attempts to crash the server with many different packets.");
    }
}
