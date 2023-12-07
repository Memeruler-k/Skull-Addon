package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class SwingCrash extends Module {
    public SwingCrash() {
        super(Addon.CATEGORY, "Swing Crash", "Attempts to crash the server using Swing Packets.");
    }
}
