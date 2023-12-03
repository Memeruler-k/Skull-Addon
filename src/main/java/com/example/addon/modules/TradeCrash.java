package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class TradeCrash extends Module {
    public TradeCrash() {
        super(Addon.CATEGORY, "Trade Crash", "Attempts to crash the server by sending many Trade Packets.");
    }
}
