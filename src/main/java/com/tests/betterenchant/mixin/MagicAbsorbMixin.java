package com.tests.betterenchant.mixin;

import net.minecraft.world.damagesource.CombatRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CombatRules.class)
public class MagicAbsorbMixin {
    @ModifyConstant(method = "getDamageAfterMagicAbsorb", constant = @Constant(floatValue = 20.0F))
    private static float mixinLimitFloat(float i) {
        return 24.75F;
    }
}
