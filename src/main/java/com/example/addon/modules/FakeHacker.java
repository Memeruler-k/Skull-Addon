package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class FakeHacker extends Module {
    public FakeHacker() {
        super(Addon.CATEGORY, "FakeHacker", "Makes other players seem like they are hacking.");
    }
}
