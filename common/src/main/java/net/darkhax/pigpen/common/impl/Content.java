package net.darkhax.pigpen.common.impl;

import com.mojang.serialization.MapCodec;
import net.darkhax.bookshelf.common.api.data.conditions.ILoadCondition;
import net.darkhax.bookshelf.common.api.entity.villager.trades.VillagerOffers;
import net.darkhax.bookshelf.common.api.registry.ContentProvider;
import net.darkhax.bookshelf.common.api.registry.adapters.GameRegistryAdapter;
import net.darkhax.bookshelf.common.api.registry.adapters.GenericRegistryAdapter;
import net.darkhax.bookshelf.common.impl.registry.adapter.VillagerTradeAdapter;
import net.darkhax.pigpen.common.impl.config.TradeConfig;
import net.darkhax.pigpen.common.impl.data.conditions.ConfigProperty;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Content implements ContentProvider {

    @Override
    public void defineItems(GameRegistryAdapter<Item> registry) {
        registry.add("pigpen_pattern", new BannerPatternItem(TagKey.create(Registries.BANNER_PATTERN, PigPenMod.id("pattern_item/pigpen")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));
    }

    @Override
    public void defineTrades(VillagerTradeAdapter registry) {
        final TradeConfig config = PigPenMod.CONFIG.banner_stencil_trade;
        if (config.enabled) {
            registry.addWanderingTrade(new VillagerOffers(config.tradeOffer), config.is_rare);
        }
    }

    @Override
    public void defineLoadConditions(GenericRegistryAdapter<MapCodec<? extends ILoadCondition>> registry) {
        registry.add(ConfigProperty.TYPE_ID, ConfigProperty.CODEC);
    }

    @Override
    public String namespace() {
        return PigPenMod.MOD_ID;
    }
}