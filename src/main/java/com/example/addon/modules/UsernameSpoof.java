package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class UsernameSpoof extends Module {
    public UsernameSpoof() {
        super(Addon.CATEGORY, "Username Spoof", "Spoofs your username for everyone.");
    }
}
