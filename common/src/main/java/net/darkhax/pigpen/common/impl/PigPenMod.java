package net.darkhax.pigpen.common.impl;

import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PigPenMod {

    public static final String MOD_ID = "pigpen";
    public static final String MOD_NAME = "PigPen";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}