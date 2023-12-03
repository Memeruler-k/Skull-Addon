package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class BedCrash extends Module {
    public BedCrash() {
        super(Addon.CATEGORY, "Bed Crash", "Attempts to crash the server with beds.");
    }
}
