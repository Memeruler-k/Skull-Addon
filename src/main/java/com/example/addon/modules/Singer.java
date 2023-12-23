package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class Singer extends Module {
    public Singer() {
        super(Addon.CATEGORY, "Singer", "Automatically sings music lyrics or something in the chat.");
    }
}
