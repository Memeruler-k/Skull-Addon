package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class VelocityCrash extends Module {
    public VelocityCrash() {
        super(Addon.CATEGORY, "Velocity Crash", "Attempts to crash the server using Velocity.");
    }
}
