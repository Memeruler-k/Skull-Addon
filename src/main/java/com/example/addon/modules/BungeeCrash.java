package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class BungeeCrash extends Module {
    public BungeeCrash() {
        super(Addon.CATEGORY, "Bungee Crash", "Attempts to crash the server using Bungeecord.");
    }
}
