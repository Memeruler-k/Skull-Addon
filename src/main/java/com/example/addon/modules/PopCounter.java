package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class PopCounter extends Module {
    public PopCounter() {
        super(Addon.CATEGORY, "Pop Counter", "Counts how many totems you or your enemy has popped");
    }
}
