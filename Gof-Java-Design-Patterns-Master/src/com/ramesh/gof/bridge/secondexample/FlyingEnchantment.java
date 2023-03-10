package com.ramesh.gof.bridge.secondexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FlyingEnchantment implements Enchantment {
	private static final Logger LOGGER = LogManager.getLogger(FlyingEnchantment.class);

	@Override
	public void onActivate() {
		LOGGER.info("The item begins to glow faintly.");
	}

	@Override
	public void apply() {
		LOGGER.info("The item flies and strikes the enemies finally returning to owner's hand.");
	}

	@Override
	public void onDeactivate() {
		LOGGER.info("The item's glow fades.");
	}
}
