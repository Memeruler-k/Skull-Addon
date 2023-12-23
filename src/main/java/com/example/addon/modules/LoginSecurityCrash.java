package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class LoginSecurityCrash extends Module {
    public LoginSecurityCrash() {
        super(Addon.CATEGORY, "Login Security Crash", "Attempts to crash servers using LoginSecurity.");
    }
}
