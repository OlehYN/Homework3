package com.javaee.dependency.homework3.fighter;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.javaee.dependency.homework3.weapon.Weapon;

public class ShinobiFighter implements Fighter {

	public static final double DEFAULT_ATTACK = 5;
	public static final double DEFAULT_DEFEND = 4;

	public static final double CRITICAL = 0.75;
	public static final double DEVIATION = 0.5;

	@Autowired
	@Qualifier("woodSword")
	private Weapon weapon;

	private String excuse;
	private String celebration;

	private Random random;

	public ShinobiFighter(String excuse, String celebration) {
		this.excuse = excuse;
		this.celebration = celebration;

		random = new Random();
	}

	public double attack() {
		double chance = random.nextDouble();
		double currentDamage = DEFAULT_ATTACK + weapon.damage();

		if (chance < CRITICAL)
			currentDamage *= 2;

		return currentDamage;
	}

	public double defend(double incomingDamage) {
		double chance = random.nextDouble();

		if (chance < DEVIATION)
			return 0;

		incomingDamage -= DEFAULT_DEFEND;

		if (incomingDamage < 0)
			return 0;

		return incomingDamage;
	}

	public void celebrateVictory() {
		System.out.println(celebration);
	}

	public void tellExcuse() {
		System.out.println(excuse);
	}

}
