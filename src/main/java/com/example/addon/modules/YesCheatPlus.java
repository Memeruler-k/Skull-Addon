package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample extends Module {
    public ModuleExample() {
        super(Addon.CATEGORY, "YesCheat+", "YesCheat+ can be used to prevent admins and server plugins from detecting your cheats. It can also be used to reduce your chances of getting banned.");
    }
}
