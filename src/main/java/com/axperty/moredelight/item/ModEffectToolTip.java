package com.axperty.moredelight.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModEffectToolTip extends Item {

    private final StatusEffect effect;
    private final int duration;
    private final int amplifier;

    public ModEffectToolTip(StatusEffect effect, int duration, int amplifier, Item.Settings settings) {
        super(settings);
        this.effect = effect;
        this.duration = duration;
        this.amplifier = amplifier;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        StatusEffectInstance statusEffectInstance = new StatusEffectInstance(effect, duration, amplifier);
        tooltip.add(Text.translatable(effect.getTranslationKey())
                .append(" (")
                .append(StatusEffectUtil.getDurationText(statusEffectInstance, 1.0f))
                .formatted(Formatting.BLUE)
                .append(")"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
