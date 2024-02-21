package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample1 extends Module {
    public ModuleExample1() {
        super(Addon.CATEGORY, "AAC Crash", "Supposed crash methrods for servers using AAC");
    }
}
