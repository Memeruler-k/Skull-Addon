package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class LagDetector extends Module {
    public LagDetector() {
        super(Addon.CATEGORY, "LagDetector", "Detects lag.");
    }
}
