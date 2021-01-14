package com.ahrondus.moreusefuleggs.integration.jei;

import com.ahrondus.moreusefuleggs.MoreUsefulEggs;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.util.ResourceLocation;

@JeiPlugin
public class MUEJeiPlugin implements IModPlugin {
	
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation(MoreUsefulEggs.MOD_ID, "jei_plugin");
		
	}
}
