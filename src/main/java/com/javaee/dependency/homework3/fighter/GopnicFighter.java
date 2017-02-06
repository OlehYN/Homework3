package com.javaee.dependency.homework3.fighter;

import java.util.Random;

public class GopnicFighter implements Fighter {

	private double attack;
	private double defense;

	private double failChance;

	private String excuse;
	private String celebration;

	public static final double FAIL_IMPACT = 2;

	private Random random = new Random();

	public static final String DEFAULT_MESSAGE = "АЛЬО";

	public double attack() {
		double chance = random.nextDouble();

		if (chance < failChance)
			return 0;
		else
			return attack;
	}

	public double defend(double incoming) {
		double chance = random.nextDouble();

		if (chance < failChance)
			return incoming * FAIL_IMPACT;

		incoming -= defense;

		if (incoming > 0)
			return incoming;
		return 0;
	}

	public void celebrateVictory() {
		if (celebration == null)
			System.out.println(DEFAULT_MESSAGE);
		else
			System.out.println(celebration);

	}

	public void tellExcuse() {
		if (excuse == null)
			System.out.println(DEFAULT_MESSAGE);
		else
			System.out.println(excuse);

	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public double getFailChance() {
		return failChance;
	}

	public void setFailChance(double failChance) {
		this.failChance = failChance;
	}

	public String getExcuse() {
		return excuse;
	}

	public void setExcuse(String excuse) {
		this.excuse = excuse;
	}

	public String getCelebration() {
		return celebration;
	}

	public void setCelebration(String celebration) {
		this.celebration = celebration;
	}

}
