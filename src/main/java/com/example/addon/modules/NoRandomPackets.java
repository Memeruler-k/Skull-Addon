package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class NoRandomPackets extends Module {
    public NoRandomPackets() {
        super(Addon.CATEGORY, "No Random Packets", "Stop Random Packets from sending to client.");
    }
}
