package com.javaee.dependency.homework3.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.javaee.dependency.homework3.fighter.Fighter;
import com.javaee.dependency.homework3.fighter.JackieChanFighter;
import com.javaee.dependency.homework3.weapon.Furniture;
import com.javaee.dependency.homework3.weapon.Weapon;

@Aspect
public class DarthVader {

	@Before("execution(* com.javaee.dependency.homework3.fighter.Fighter.attack(..))")
	public void logAround(JoinPoint joinPoint) throws Throwable {

		Fighter fighter = (Fighter) joinPoint.getTarget();

		if (fighter instanceof JackieChanFighter) {
			
			List<Furniture> weapons = (List<Furniture>) ((JackieChanFighter) fighter).getWeapons();

			System.out.println("Дарт Вейдер: Вхахахах! Джекі не зможе використовувати поломані меблі!");

			for (Weapon weapon : weapons)
				weapon.damage();

		}
	}
}
