package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class UnknownPacketCrash extends Module {
    public UnknownPacketCrash() {
        super(Addon.CATEGORY, "Unknown Packet Crash", "Attempts to crash the server using unknown packets.");
    }
}
