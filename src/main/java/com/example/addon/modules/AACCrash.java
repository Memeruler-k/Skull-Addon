package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample extends Module {
    public ModuleExample() {
        super(Addon.CATEGORY, "AAC Crash", "Supposed crash methrods for servers using AAC");
    }
}
