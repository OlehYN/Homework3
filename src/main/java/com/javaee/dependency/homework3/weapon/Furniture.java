package com.javaee.dependency.homework3.weapon;

public class Furniture implements Weapon {

	private boolean used;

	private double damage;
	private double defense;

	public Furniture(double damage, double defense) {
		this.damage = damage;
		this.defense = defense;
	}

	public double damage() {
		if (!used) {
			used = true;
			return damage;
		}

		return 0;
	}

	public double defense() {
		if (!used) {
			used = true;
			return defense;
		}

		return 0;
	}

}
