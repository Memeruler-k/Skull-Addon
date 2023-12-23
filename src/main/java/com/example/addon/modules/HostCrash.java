package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class HostCrash extends Module {
    public HostCrash() {
        super(Addon.CATEGORY, "Host Crash", "Attempts to crash the server using specfic Hosts");
    }
}
