package com.makersfactory.mfygps;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class GPSHeadset extends ItemArmor {

	public GPSHeadset(ArmorMaterial mat, int id) {
		super(mat, id, 0);
		this.setUnlocalizedName("gpsHeadset");
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("mfygps:gpsHeadsetIcon");
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "mfygps:textures/models/armor/gpsHeadset.png";
	}

}
