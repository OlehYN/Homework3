package com.javaee.dependency.homework3.weapon;

public class Sword implements Weapon {

	private double materialQuality;

	public static final double DEFAULT_ATTACK = 3;
	public static final double DEFAULT_DEFEND = 2;

	public Sword(double materialQuality) {
		this.materialQuality = materialQuality;
	}

	public double damage() {
		return materialQuality * DEFAULT_ATTACK;
	}

	public double defense() {
		return materialQuality * DEFAULT_DEFEND;
	}

}
