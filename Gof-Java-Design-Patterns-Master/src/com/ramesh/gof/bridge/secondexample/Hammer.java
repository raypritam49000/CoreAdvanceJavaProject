package com.ramesh.gof.bridge.secondexample;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hammer implements Weapon {

	private final Enchantment enchantment;
	private static final Logger LOGGER = LogManager.getLogger(Hammer.class);
	
	public Hammer(Enchantment enchantment) {
		this.enchantment = enchantment;
	}

	@Override
	public void wield() {
		LOGGER.info("The hammer is wielded.");
		enchantment.onActivate();
	}

	@Override
	public void swing() {
		LOGGER.info("The hammer is swinged.");
		enchantment.apply();
	}

	@Override
	public void unwield() {
		LOGGER.info("The hammer is unwielded.");
		enchantment.onDeactivate();
	}

	@Override
	public Enchantment getEnchantment() {
		return enchantment;
	}
}
