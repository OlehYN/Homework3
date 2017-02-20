package com.javaee.dependency.homework3.weapon;

public class Furniture implements Weapon {

	private boolean used;

	private double damage;
	private double defense;
	private String name;

	public Furniture(String name, double damage, double defense) {
		this.damage = damage;
		this.defense = defense;
		this.setName(name);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Furniture [used=" + used + ", damage=" + damage + ", defense=" + defense + ", name=" + name + "]";
	}

}
