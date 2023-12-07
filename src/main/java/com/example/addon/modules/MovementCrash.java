package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class MovementCrash extends Module {
    public MovementCrash() {
        super(Addon.CATEGORY, "Movement Crash", "Attempts to crash the server by sending Movement Packets.");
    }
}
