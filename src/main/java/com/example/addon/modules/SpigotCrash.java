package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class SpigotCrash extends Module {
    public SpigotCrash() {
        super(Addon.CATEGORY, "Spigot Crash", "Attempts to crash the server using Spigot.");
    }
}
