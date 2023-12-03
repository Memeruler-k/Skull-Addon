package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ServerConsole extends Module {
    public ServerConsole() {
        super(Addon.CATEGORY, "Server Console", "Execute commands through the server console DOES NOT REQUIRE OP.");
    }
}
