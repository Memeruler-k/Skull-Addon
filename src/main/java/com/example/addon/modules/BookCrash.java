package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class BookCrash extends Module {
    public BookCrash() {
        super(Addon.CATEGORY, "Book Crash", "Attempts to crash the server by sending Book Packets.");
    }
}
