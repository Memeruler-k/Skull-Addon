package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ExcpectionCrash extends Module {
    public ExcpectionCrash() {
        super(Addon.CATEGORY, "Excpection Crash", "Attempts to crash the server using Excpection Packets.");
    }
}
