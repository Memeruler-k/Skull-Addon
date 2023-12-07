package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ServerLogger extends Module {
    public ServerLogger() {
        super(Addon.CATEGORY, "Server Logger", "Logs anything that happens on the server.");
    }
}
