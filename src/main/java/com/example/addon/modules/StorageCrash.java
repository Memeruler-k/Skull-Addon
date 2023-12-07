package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class StorageCrash extends Module {
    public StorageCrash() {
        super(Addon.CATEGORY, "Storage Crash", "Attempts to crash the server using Storage Packets.");
    }
}
