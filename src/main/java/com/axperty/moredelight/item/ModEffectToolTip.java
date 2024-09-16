package com.axperty.moredelight.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class ModEffectToolTip extends Item {

    private final RegistryEntry<StatusEffect> effect;
    private final int duration;
    private final int amplifier;

    public ModEffectToolTip(RegistryEntry<StatusEffect> effect, int duration, int amplifier, Item.Settings settings) {
        super(settings);
        this.effect = effect;
        this.duration = duration;
        this.amplifier = amplifier;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        StatusEffectInstance statusEffectInstance = new StatusEffectInstance(effect, duration, amplifier);
        tooltip.add(Text.translatable(effect.value().getTranslationKey())
                .append(" (")
                .append(StatusEffectUtil.getDurationText(statusEffectInstance, 1.0f, 20))
                .formatted(Formatting.BLUE)
                .append(")"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
