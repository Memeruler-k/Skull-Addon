package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class OffhandCrash extends Module {
    public OffhandCrash() {
        super(Addon.CATEGORY, "Offhand Crash", "Attempts to crash the server by quickly switching items.");
    }
}
