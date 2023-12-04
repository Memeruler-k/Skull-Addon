package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class AutoBuild extends Module {
    public AutoBuild() {
        super(Addon.CATEGORY, "Auto Build", "Automatically builds random shit.");
    }
}
