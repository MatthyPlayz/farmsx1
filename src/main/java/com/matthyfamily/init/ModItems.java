package com.matthyfamily.init;

import com.matthyfamily.Reference;
import com.matthyfamily.items.ItemBasic;
import com.matthyfamily.items.ItemBasicSeeds;
import com.matthyfamily.init.ModBlocks;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModItems {
	
	public static Item diamondSeeds;
	
	public static void init() {
		
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		diamondSeeds = new ItemBasicSeeds(ModBlocks.diamondCrop, Blocks.FARMLAND, "diamond_seeds");
		event.getRegistry().registerAll(diamondSeeds);
	}
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(diamondSeeds);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
