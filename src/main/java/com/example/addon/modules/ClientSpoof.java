package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ClientSpoof extends Module {
    public ClientSpoof() {
        super(Addon.CATEGORY, "Client Spoof", "Spoofs your client to make you look like you are using another client.");
    }
}
