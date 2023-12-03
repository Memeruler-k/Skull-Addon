package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ServerCrash extends Module {
    public ServerCrash() {
        super(Addon.CATEGORY, "Server Crash", "Crashes the server in a basic way.");
    }
}
