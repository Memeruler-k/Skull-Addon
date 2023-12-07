package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class VersionSpoof extends Module {
    public VersionSpoof() {
        super(Addon.CATEGORY, "Version Spoof", "Spoofs your Client Version to join older/newer servers.");
    }
}
