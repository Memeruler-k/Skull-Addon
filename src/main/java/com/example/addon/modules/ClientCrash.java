package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ClientCrash extends Module {
    public ClientCrash() {
        super(Addon.CATEGORY, "Client Crash", "Crash other players client");
    }
}
