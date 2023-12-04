package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class CoordLogger extends Module {
    public CoordLogger() {
        super(Addon.CATEGORY, "Coord Logger", "Logs others coordinates.");
    }
}
