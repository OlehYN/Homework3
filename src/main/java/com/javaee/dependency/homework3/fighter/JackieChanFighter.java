package com.javaee.dependency.homework3.fighter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javaee.dependency.homework3.weapon.Weapon;

public class JackieChanFighter implements Fighter{
	
	private List<Weapon> weapons;
	private String celebration;
	private String excuse;
	
	public static final double JACKIE_SKILL = 5;
	
	@Autowired
	public JackieChanFighter(String celebration, String excuse){
		this.celebration = celebration;
		this.excuse = excuse;
	}

	public double attack() {
		double total = 0;
		
		for(Weapon weapon: weapons)
			total += weapon.damage();
		
		return total * JACKIE_SKILL;
	}

	public double defend(double incoming) {
		double total = 0;
		
		for(Weapon weapon: weapons)
			total += weapon.defense();
		
		return total / JACKIE_SKILL;
	}

	public void celebrateVictory() {
		System.out.println(celebration);
	}

	public void tellExcuse() {
		System.out.println(excuse);
	}
	
	
	public List<Weapon> getWeapons() {
		return weapons;
	}

	@Autowired
	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

}
