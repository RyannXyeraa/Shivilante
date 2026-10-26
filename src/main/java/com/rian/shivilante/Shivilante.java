package com.rian.shivilante;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rian.shivilante.item.ModItems;

public class Shivilante implements ModInitializer {
	public static final String MOD_ID = "shivilante";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Shivilante Mod");

        ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
