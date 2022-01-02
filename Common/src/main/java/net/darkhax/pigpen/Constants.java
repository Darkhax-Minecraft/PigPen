package net.darkhax.pigpen;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constants {

    public static final String MOD_ID = "pigpen";
    public static final String MOD_NAME = "Pig Pen";
    public static final Logger LOG = LogManager.getLogger(MOD_NAME);

    public static final ResourceLocation FONT_RUNELIC = new ResourceLocation("pigpen", "pigpen");
    public static final ResourceLocation FONT_DEFAULT = new ResourceLocation("minecraft", "default");
}