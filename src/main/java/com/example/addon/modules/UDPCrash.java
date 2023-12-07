package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class UDPCrash extends Module {
    public UDPCrash() {
        super(Addon.CATEGORY, "UDP Crash", "Attempts to crash the server using the UDP Exploit.");
    }
}
