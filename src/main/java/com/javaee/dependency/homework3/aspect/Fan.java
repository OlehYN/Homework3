package com.javaee.dependency.homework3.aspect;

import org.aspectj.lang.JoinPoint;

import com.javaee.dependency.homework3.fighter.Fighter;
import com.javaee.dependency.homework3.fighter.ShinobiFighter;

public class Fan {
	public void congratulations(JoinPoint joinPoint) {
		Fighter fighter = (Fighter) joinPoint.getTarget();

		if (fighter instanceof ShinobiFighter) {
			System.out.println("Фанат: Кіііііяяяя! Я просто в захваті!");
		}
	}
}
