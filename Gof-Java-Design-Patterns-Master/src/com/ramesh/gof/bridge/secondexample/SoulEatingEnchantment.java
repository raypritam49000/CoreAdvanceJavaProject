package com.ramesh.gof.bridge.secondexample;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SoulEatingEnchantment implements Enchantment {
	private static final Logger LOGGER = LogManager.getLogger(SoulEatingEnchantment.class);
	@Override
	public void onActivate() {
		LOGGER.info("The item spreads bloodlust.");
	}

	@Override
	public void apply() {
		LOGGER.info("The item eats the soul of enemies.");
	}

	@Override
	public void onDeactivate() {
		LOGGER.info("Bloodlust slowly disappears.");
	}
}
