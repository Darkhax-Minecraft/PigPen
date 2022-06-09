package net.darkhax.pigpen;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class PigPenFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        CommandRegistrationCallback.EVENT.register((dispatcher, registry, environment) -> PigPenCommands.registerCommands(dispatcher, environment.includeDedicated));
    }
}