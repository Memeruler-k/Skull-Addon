package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample extends Module {
   private final SettingGroup sgPos = settings.createGroup("Client");
   private final SettingGroup sgPos = settings.createGroup("Movement");
   private final SettingGroup sgPos = settings.createGroup("Bypass");

   private final Setting<Boolean> setYaw = sgClient.add(new BoolSetting.Builder()
            .name("set-yaw")
            .description("Sets yaw client side.")
            .defaultValue(true)
            .build()
    );

   private final Setting<Boolean> setYaw = sgClient.add(new BoolSetting.Builder()
            .name("set-move")
            .description("Sets movement client side.")
            .defaultValue(true)
            .build()
    );

   private final Setting<Boolean> setYaw = sgClient.add(new BoolSetting.Builder()
            .name("set-pos")
            .description("Sets position client side.")
            .defaultValue(true)
            .build()
    );

   private final Setting<Boolean> setID = sgClient.add(new BoolSetting.Builder()
            .name("set-id")
            .description("Updates teleport id when a position packet is received.")
            .defaultValue(false)
            .build()
    );
    
   private final Setting<Double> horizontalSpeed = sgMovement.add(new DoubleSetting.Builder()
            .name("horizontal-speed")
            .description("Horizontal speed in blocks per second.")
            .defaultValue(5.2)
            .min(0.0)
            .max(20.0)
            .sliderMin(0.0)
            .sliderMax(20.0)
            .build()
    );

   private final Setting<Double> verticalSpeed = sgMovement.add(new DoubleSetting.Builder()
            .name("vertical-speed")
            .description("Vertical speed in blocks per second.")
            .defaultValue(1.24)
            .min(0.0)
            .max(20.0)
            .sliderMin(0.0)
            .sliderMax(20.0)
            .build()
    );

   private final Setting<Boolean> sendTeleport = sgMovement.add(new BoolSetting.Builder()
            .name("teleport")
            .description("Sends teleport packets.")
            .defaultValue(true)
            .build()
    );

   private final Setting<Boolean> antiKick = sgBypass.add(new BoolSetting.Builder()
            .name("anti-kick")
            .description("Moves down occasionally to prevent kicks.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> GrimAC = sgBypass.add(new BoolSetting.Builder()
            .name("GrimAC")
            .description("Bypass for Grim.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> Vulcan = sgBypass.add(new BoolSetting.Builder()
            .name("Vulcan")
            .description("Bypass for Vulcan.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> Spartan = sgBypass.add(new BoolSetting.Builder()
            .name("Spartan")
            .description("Bypass for Spartan.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> NoCheatPlus = sgBypass.add(new BoolSetting.Builder()
            .name("NCP")
            .description("Bypass for NoCheatPlus.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> Cubecraft = sgBypass.add(new BoolSetting.Builder()
            .name("Cubecraft")
            .description("Bypass for Cubecraft.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> Watchdog = sgBypass.add(new BoolSetting.Builder()
            .name("Watchdog")
            .description("Bypass for Watchdog.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> Packet = sgBypass.add(new BoolSetting.Builder()
            .name("Packet")
            .description("Flies with packets.")
            .defaultValue(true)
            .build()
    );

   private final Setting<Boolean> Matrix = sgBypass.add(new BoolSetting.Builder()
            .name("Matrix")
            .description("Bypass for Matrix.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> AAC = sgBypass.add(new BoolSetting.Builder()
            .name("AAC")
            .description("Bypass for AAC.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> PVPLand = sgBypass.add(new BoolSetting.Builder()
            .name("PVP Land")
            .description("Bypass for PVP Land.")
            .defaultValue(false)
            .build()
    );

   private final Setting<Boolean> Negativity = sgBypass.add(new BoolSetting.Builder()
            .name("Negativity")
            .description("Bypass for Negativity.")
            .defaultValue(false)
            .build()
                                                            
   super(Addon.CATEGORY, "Fly Plus", "Bypass fly on anticheat.");

    }
