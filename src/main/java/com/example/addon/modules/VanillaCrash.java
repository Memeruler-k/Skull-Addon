package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class VanillaCrash extends Module {
    public VanillaCrash() {
        super(Addon.CATEGORY, "Vanilla Crash", "Attempts to crash the server using Vanilla.");
    }
}
