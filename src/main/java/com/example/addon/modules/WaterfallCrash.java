package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class WaterfallCrash extends Module {
    public WaterfallCrash() {
        super(Addon.CATEGORY, "Waterfall Crash", "Attempts to crash the server using Waterfall.");
    }
}
