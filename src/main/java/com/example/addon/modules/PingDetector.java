package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class PingDetector extends Module {
    public PingDetector() {
        super(Addon.CATEGORY, "PingDetector", "Detects ping.");
    }
}
