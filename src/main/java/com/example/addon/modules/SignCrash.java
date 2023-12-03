package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class SignCrash extends Module {
    public SignCrash() {
        super(Addon.CATEGORY, "Sign Crash", "Attempts to crash the server by spamming sign update packets.");
    }
}
