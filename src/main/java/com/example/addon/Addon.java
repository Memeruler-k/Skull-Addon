package com.example.addon;

import com.example.addon.hud.HudExample;
import com.example.addon.modules.AdvancedCrash;
import com.example.addon.modules.AnchorPlus;
import com.example.addon.modules.AntiAim;
import com.example.addon.modules.AntiCheatBypass;
import com.example.addon.modules.AntiGamingChairCrash;
import com.example.addon.modules.AntiHungerExploit;
import com.example.addon.modules.AntiSurround;
import com.example.addon.modules.ArmorstandCrash;
import com.example.addon.modules.ModuleExample;
import com.example.addon.modules.ModuleExample1;
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
        Modules.get().add(new AdvancedCrash());
        Modules.get().add(new AnchorPlus());
        Modules.get().add(new AntiAim());
        Modules.get().add(new AntiCheatBypass());
        Modules.get().add(new AntiGamingChairBypass());
        Modules.get().add(new AntiHungerExploit());
        Modules.get().add(new AntiSurround());
        Modules.get().add(new ArmorstandCrash());

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
