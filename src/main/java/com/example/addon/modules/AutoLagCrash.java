package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class AutoLagCrash extends Module {
    public AutoLagCrash() {
        super(Addon.CATEGORY, "Auto Lag Crash", "Attempts to crash the server with Auto Lag.");
    }
}
