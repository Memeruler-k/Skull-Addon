package com.example.addon;

import com.example.addon.hud.HudExample;
import com.example.addon.modules.ModuleExample;
import com.example.addon.modules.ModuleExample1;
import com.example.addon.modules.Bypass;
import com.example.addon.modules.Crash;
import com.example.addon.modules.Render;
import com.example.addon.modules.Player;
import com.example.addon.modules.Exploits;
import com.example.addon.modules.Fun;
import com.example.addon.modules.Troll;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Skull");
    public static final HudGroup HUD_GROUP = new HudGroup("Skull");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Skull Addon");

        // Modules
        Modules.get().add(new ModuleExample());
        Modules.get().add(new ModuleExample1());

        // Commands
        

        // HUD
        Hud.get().register(HudExample.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}
