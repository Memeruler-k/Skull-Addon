package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class PaperCrash extends Module {
    public PaperCrash() {
        super(Addon.CATEGORY, "Paper Crash", "Attempts to crash the server using Paper Vulnerabilities and Exploits.");
    }
}
