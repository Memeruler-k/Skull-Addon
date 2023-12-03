package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class PacketCrash extends Module {
    public PacketCrash() {
        super(Addon.CATEGORY, "PacketCrash", "Attempts to crash the server using packets.");
    }
}
